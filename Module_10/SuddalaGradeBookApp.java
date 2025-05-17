package Module_10;

// File: SuddalaGradeBookApp.java
// JavaFX UI-only GradeBook application (default package—no folders).
// Place this file at the root of your VS Code workspace alongside a ".vscode" directory.

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SuddalaGradeBookApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Role selection 
        ChoiceDialog<String> roleDialog = new ChoiceDialog<>("Student", "Student", "Teacher", "Administrator");
        roleDialog.setTitle("Select Role");
        roleDialog.setHeaderText("Choose your role to launch the GradeBook UI");
        roleDialog.showAndWait();

        // Build UI form
        Label firstNameLbl = new Label("First Name:");
        TextField firstNameField = new TextField();

        Label lastNameLbl = new Label("Last Name:");
        TextField lastNameField = new TextField();

        Label courseLbl = new Label("Course:");
        TextField courseField = new TextField();

        Label gradeLbl = new Label("Grade:");
        ComboBox<String> gradeCombo = new ComboBox<>();
        gradeCombo.getItems().addAll("A", "B", "C", "D", "E", "F");

        Button saveBtn = new Button("Save Entry");
        Button viewBtn = new Button("View Grades");
        Button clearFormBtn = new Button("Clear Form");
        Button clearAllBtn = new Button("Clear All Grades");

        HBox formRow1 = new HBox(10, firstNameLbl, firstNameField, lastNameLbl, lastNameField);
        HBox formRow2 = new HBox(10, courseLbl, courseField, gradeLbl, gradeCombo);
        HBox buttonRow = new HBox(10, saveBtn, viewBtn, clearFormBtn, clearAllBtn);
        formRow1.setPadding(new Insets(10));
        formRow2.setPadding(new Insets(10));
        buttonRow.setPadding(new Insets(10));

        VBox root = new VBox(10, formRow1, formRow2, buttonRow);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 600, 200);
        primaryStage.setTitle("GradeBookApp UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

