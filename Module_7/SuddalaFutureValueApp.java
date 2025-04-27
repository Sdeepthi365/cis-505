
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class SuddalaFutureValueApp extends Application {

    // Private UI components
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfInterestRate = new TextField();
    private TextArea taFutureValue = new TextArea();
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("(Enter 11.1% as 11.1)");
    private Label lblYears = new Label("Years:");
    private Label lblFutureValue = new Label("Future Value:");
    private ComboBox<Integer> cbYears = new ComboBox<>();
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    // Setting up the @Override start method with a single argument for the Stage object.
    @Override
    public void start(Stage primaryStage) {
        // Setting up the GridPane
        GridPane gridPane = new GridPane(); // creating the Gridpane object
        gridPane.setAlignment(Pos.CENTER); // Setting the alignment of the pane to the center.
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); //Setting the padding of the pane to 11.5, 12.5, 13.5, and 14.5.
        gridPane.setHgap(5.5); //Setting the Hgap to 5.5
        gridPane.setVgap(5.5); //Setting the Vgap to 5.5
     

        // Setting styles for UI components.
        lblInterestRateFormat.setTextFill(Color.RED); //Setting the font color of the instructions of interest rate to RED.
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); //Setting the position of the label to the right of the pane.
       

        // Adding components to GridPane
        gridPane.add(lblMonthlyPayment, 0, 0);
        gridPane.add(tfMonthlyPayment, 1, 0);
        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(tfInterestRate, 1, 1);
        gridPane.add(lblInterestRateFormat, 1, 2); //Adding the label to the gridpane.
        gridPane.add(lblYears, 0, 3);
        gridPane.add(cbYears, 1, 3);
        gridPane.add(lblFutureValue, 0, 5);
        gridPane.add(taFutureValue, 1, 5);

        // Buttons in HBox
        HBox actionBtnContainer = new HBox(); //Creating a new HBox object.
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)); //Setting the padding of the HBox to 15, 0, 15, and 30.
        actionBtnContainer.setSpacing(10); //Setting the spacing of the HBox to 10. 
        actionBtnContainer.getChildren().addAll(btnClear, btnCalculate); //Adding the buttons to the HBox.
        gridPane.add(actionBtnContainer, 1, 4); //Adding the HBox to the gridpane.
        

        // Setting up Scene and Stage
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Suddala Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
