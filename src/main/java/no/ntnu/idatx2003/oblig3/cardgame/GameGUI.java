package no.ntnu.idatx2003.oblig3.cardgame;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameGUI extends Application {
    // Initializes playing card deck
    PlayingCardDeck playingCardDeck = new PlayingCardDeck();

    // Variable field
    private Label cardSlot1;
    private Label cardSlot2;
    private Label cardSlot3;
    private Label cardSlot4;
    private Label cardSlot5;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a BorderPane
        BorderPane root = new BorderPane();
        VBox vButtonBox = new VBox();
        HBox hLabelBox = new HBox();

        // Creates buttons
        Button button1 = new Button("Print cards");
        Button button2 = new Button("Shuffle");

        //Creates card slots
        cardSlot1 = new Label("");
        cardSlot2 = new Label("");
        cardSlot3 = new Label("");
        cardSlot4 = new Label("");
        cardSlot5 = new Label("");

        // Adds events and classes to buttons
        button1.getStyleClass().add("custom-button"); // Adding a custom CSS class
        button2.getStyleClass().add("custom-button"); // Adding a custom CSS class
        vButtonBox.getStyleClass().add("vButtonBox"); // Adding a custom CSS class
        button1.setOnAction(event -> handleClick());
        button2.setOnAction(event -> handleClick2());

        // Adds classes to labels
        cardSlot1.getStyleClass().add("label");
        cardSlot2.getStyleClass().add("label");
        cardSlot3.getStyleClass().add("label");
        cardSlot4.getStyleClass().add("label");
        cardSlot5.getStyleClass().add("label");

        // Style via java
        vButtonBox.setSpacing(10);

        // Distributes objects to border areas
        vButtonBox.getChildren().addAll(button1, button2);
        root.setRight(vButtonBox);
        hLabelBox.getChildren().addAll(cardSlot1,cardSlot2,cardSlot3,cardSlot4,cardSlot5);
        root.setCenter(hLabelBox);


        Scene scene = new Scene(root, 700, 500);
        scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Card game ultimate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleClick() {
        playingCardDeck.shuffle();
        cardSlot1.setText(playingCardDeck.getCardBasedOnIndex(0).getAsString());
        cardSlot2.setText(playingCardDeck.getCardBasedOnIndex(1).getAsString());
        cardSlot3.setText(playingCardDeck.getCardBasedOnIndex(2).getAsString());
        cardSlot4.setText(playingCardDeck.getCardBasedOnIndex(3).getAsString());
        cardSlot5.setText(playingCardDeck.getCardBasedOnIndex(4).getAsString());
    }
    private void handleClick2() {
        playingCardDeck.shuffle();
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
