import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorChoiceBoxApp extends Application {

    @Override
    public void start(Stage stage) {

        // Label that changes based on selection
        Label label = new Label("Select a color");

        // ChoiceBox with color options
        ChoiceBox<String> colorBox = new ChoiceBox<>();
        colorBox.getItems().addAll("Red", "Green", "Blue", "Yellow", "Purple");

        // Event: change label text when a color is selected
        colorBox.setOnAction(e -> {
            String selected = colorBox.getValue();
            label.setText("You selected: " + selected);
        });

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(colorBox, label);

        // Scene
        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("Color ChoiceBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
