import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TextEditorMenuApp extends Application {

    @Override
    public void start(Stage stage) {

        // --- MenuBar ---
        MenuBar menuBar = new MenuBar();

        // --- File Menu ---
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Exit action
        exitItem.setOnAction(e -> stage.close());

        fileMenu.getItems().addAll(newItem, openItem, saveItem, newItem, openItem, saveItem, exitItem);

        // --- Edit Menu ---
        Menu editMenu = new Menu("Edit");

        // --- Help Menu ---
        Menu helpMenu = new Menu("Help");

        // Add menus to menubar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // --- Layout ---
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Simple Text Editor Interface");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
