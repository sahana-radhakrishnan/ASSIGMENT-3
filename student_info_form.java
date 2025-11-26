import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StudentFormApp extends Application {

    @Override
    public void start(Stage stage) {

        // --- TextFields ---
        TextField nameField = new TextField();
        nameField.setPromptText("Enter Student Name");

        TextField regNoField = new TextField();
        regNoField.setPromptText("Enter Register Number");

        // --- Gender Selection (RadioButtons) ---
        Label genderLabel = new Label("Gender:");

        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        HBox genderBox = new HBox(10, genderLabel, male, female);

        // --- Department Selection (ComboBox) ---
        ComboBox<String> deptBox = new ComboBox<>();
        deptBox.getItems().addAll("CSE", "IT", "ECE", "EEE", "MECH", "CIVIL");
        deptBox.setPromptText("Select Department");

        // --- TextArea for Output ---
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setPrefHeight(150);

        // --- Submit Button ---
        Button submitBtn = new Button("Submit");

        submitBtn.setOnAction(e -> {
            String name = nameField.getText();
            String regNo = regNoField.getText();

            RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
            String gender = (selectedGender != null) ? selectedGender.getText() : "Not Selected";

            String department = deptBox.getValue() != null ? deptBox.getValue() : "Not Selected";

            // Display all info in TextArea
            outputArea.setText(
                    "Student Information:\n" +
                    "Name: " + name + "\n" +
                    "Register Number: " + regNo + "\n" +
                    "Gender: " + gender + "\n" +
                    "Department: " + department
            );
        });

        // Layout
        VBox root = new VBox(12);
        root.getChildren().addAll(
                nameField,
                regNoField,
                genderBox,
                deptBox,
                submitBtn,
                outputArea
        );

        Scene scene = new Scene(root, 350, 350);
        stage.setTitle("Student Information Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
