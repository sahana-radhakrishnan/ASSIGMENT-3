import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        // Getting Java and JavaFX versions
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.runtime.version");

        // Labels
        Label message = new Label("Hello, JavaFX!");
        Label javaLabel = new Label("Java Version: " + javaVersion);
        Label fxLabel = new Label("JavaFX Version: " + javafxVersion);

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(message, javaLabel, fxLabel);

        // Scene
        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
