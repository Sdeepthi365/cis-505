
package Module_12;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.text.Font;

import java.io.*;
import java.util.*;

public class SuddalaGradeBookApp extends Application {
    // Role definitions Student, Teacher, Administrator
    enum Role { STUDENT, TEACHER, ADMINISTRATOR; }

    private Role currentRole;
    private TextField firstNameField, lastNameField, courseField;
    private ComboBox<String> gradeBox;
    private TextArea outputArea;
    private Button saveBtn, viewBtn, clearFormBtn, clearAllBtn;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Prompt for role selection
        ChoiceDialog<Role> dialog = new ChoiceDialog<>(Role.TEACHER, Role.values());
        dialog.setTitle("Select Role");
        dialog.setHeaderText("Choose your role");
        dialog.setContentText("Role:");
        Optional<Role> result = dialog.showAndWait();
        if (result.isPresent()) {
            currentRole = result.get();
        } else {
            return; // Exit if no role selected
        }

        Label roleLabel = new Label("Role: " + currentRole);
        roleLabel.setFont(new Font("Arial", 14));

        // Form fields
        firstNameField = new TextField();
        lastNameField = new TextField();
        courseField = new TextField();
        gradeBox = new ComboBox<>();
        gradeBox.getItems().addAll("A", "B", "C", "D", "E", "F");
        gradeBox.getSelectionModel().selectFirst();

        // Buttons
        saveBtn = new Button("Save Entry");
        viewBtn = new Button("View Grades");
        clearFormBtn = new Button("Clear Form");
        clearAllBtn = new Button("Clear All Grades");

        saveBtn.setOnAction(e -> saveEntry());
        viewBtn.setOnAction(e -> viewGrades());
        clearFormBtn.setOnAction(e -> clearForm());
        clearAllBtn.setOnAction(e -> clearAllGrades());

        // Layout
        HBox form = new HBox(10,
                new VBox(5, new Label("First Name:"), firstNameField),
                new VBox(5, new Label("Last Name:"), lastNameField),
                new VBox(5, new Label("Course:"), courseField),
                new VBox(5, new Label("Grade:"), gradeBox)
        );
        form.setPadding(new Insets(10));

        HBox buttons = new HBox(10, saveBtn, viewBtn, clearFormBtn, clearAllBtn);
        buttons.setPadding(new Insets(10));

        outputArea = new TextArea();
        outputArea.setPrefHeight(200);
        outputArea.setEditable(false);

        VBox root = new VBox(10, roleLabel, form, buttons, outputArea);

        // Role-based access control
        switch (currentRole) {
            case STUDENT:
                saveBtn.setDisable(true);
                clearFormBtn.setDisable(true);
                clearAllBtn.setDisable(true);
                break;
            case TEACHER:
                clearAllBtn.setDisable(true);
                break;
            case ADMINISTRATOR:
                // all controls enabled
                break;
        }

        Scene scene = new Scene(root, 700, 400);
        primaryStage.setTitle("Grade Book App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Save a new entry to grades.csv
    private void saveEntry() {
        Student s = new Student(
                firstNameField.getText().trim(),
                lastNameField.getText().trim(),
                courseField.getText().trim(),
                gradeBox.getValue()
        );
        try {
            File file = new File("grades.csv");
            boolean isNew = !file.exists();
            try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
                if (isNew) {
                    out.println("firstName,lastName,course,grade");
                }
                out.println(s.toCSV());
            }
            outputArea.appendText("Saved: " + s + "\n");
            clearForm();
        } catch (IOException ex) {
            outputArea.appendText("Error saving entry: " + ex.getMessage() + "\n");
        }
    }

    // Read and display all entries
    private void viewGrades() {
        outputArea.clear();
        File file = new File("grades.csv");
        if (!file.exists()) {
            outputArea.setText("No grades.csv file found.\n");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("firstName")) continue;
                String[] parts = line.split(",");
                Student s = new Student(parts[0], parts[1], parts[2], parts[3]);
                outputArea.appendText(s + "\n");
            }
        } catch (IOException ex) {
            outputArea.appendText("Error reading grades: " + ex.getMessage() + "\n");
        }
    }

    // Clear input fields
    private void clearForm() {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeBox.getSelectionModel().selectFirst();
    }

    // Delete the CSV file
    private void clearAllGrades() {
        File file = new File("grades.csv");
        if (file.exists() && file.delete()) {
            outputArea.appendText("All grades cleared.\n");
        } else {
            outputArea.appendText("No grades to clear or deletion failed.\n");
        }
    }

    // Student data class
    static class Student {
        private String firstName, lastName, course, grade;
        public Student() {}
        public Student(String firstName, String lastName, String course, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
            this.grade = grade;
        }
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public String getCourse() { return course; }
        public void setCourse(String course) { this.course = course; }
        public String getGrade() { return grade; }
        public void setGrade(String grade) { this.grade = grade; }
        @Override
        public String toString() {
            return firstName + " " + lastName + ", " + course + ": " + grade;
        }
        public String toCSV() {
            return firstName + "," + lastName + "," + course + "," + grade;
        }
    }
}
