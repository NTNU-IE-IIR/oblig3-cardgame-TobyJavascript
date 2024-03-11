package no.ntnu.idatx2003.oblig3.cardgame;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a BorderPane
        BorderPane root = new BorderPane();
        VBox vButtonBox = new VBox();

        // Creates buttons
        Button button1 = new Button("Click me!");
        Button button2 = new Button("Click me 2!");

        // Adds events and classes to buttons
        button1.getStyleClass().add("custom-button"); // Adding a custom CSS class
        button2.getStyleClass().add("custom-button"); // Adding a custom CSS class
        button1.setOnAction(event -> handleClick());


        // Distributes objects to border areas
        vButtonBox.getChildren().addAll(button1, button2);
        root.setRight(vButtonBox);


        Scene scene = new Scene(root, 700, 500);
        scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Text Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public int DELETE = 0;
    private void handleClick() {
        DELETE = DELETE + 1;
        System.out.println(DELETE);
    }

    @Override
    public void stop() {
        System.exit(0);
    }

    /**
     * Starts the application by calling the static method launch().
     *
     * @param args not used in this applicatiton
     */
    public static void appMain(String[] args) {
        launch();
    }

}
