package no.ntnu.idatx2003.oblig3.cardgame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameGUI extends Application {
    // Initializes playing card deck and card evaluator
    PlayingCardDeck playingCardDeck = new PlayingCardDeck();
    CardEvaluator cardEvaluator = new CardEvaluator();

    // Variable field
    private Label cardSlot1;
    private Label cardSlot2;
    private Label cardSlot3;
    private Label cardSlot4;
    private Label cardSlot5;
    private Label queenSpadeBox;
    private Label heartBox;
    private Label flushBox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a BorderPane
        BorderPane root = new BorderPane();
        VBox vButtonBox = new VBox();
        HBox hLabelBox = new HBox();
        HBox hSpecialCardBox = new HBox();

        // Creates buttons
        Button button1 = new Button("Deal cards");
        Button button2 = new Button("Show cards");

        // Creates card slots
        cardSlot1 = new Label("");
        cardSlot2 = new Label("");
        cardSlot3 = new Label("");
        cardSlot4 = new Label("");
        cardSlot5 = new Label("");

        // Create special card info boxes
        queenSpadeBox = new Label("");
        heartBox = new Label("");
        flushBox = new Label("");

        // Adds class to root
        root.getStyleClass().add("body");

        // Adds events and classes to buttons
        vButtonBox.getStyleClass().add("vButtonBox");
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
        queenSpadeBox.getStyleClass().add("specialCardBoxes");
        heartBox.getStyleClass().add("specialCardBoxes");
        flushBox.getStyleClass().add("specialCardBoxes");

        // Style via java
        vButtonBox.setSpacing(10);

        // Distributes objects to border areas
        vButtonBox.getChildren().addAll(button1, button2);
        root.setRight(vButtonBox);
        hLabelBox.getChildren().addAll(cardSlot1,cardSlot2,cardSlot3,cardSlot4,cardSlot5);
        root.setCenter(hLabelBox);
        hSpecialCardBox.getChildren().addAll(queenSpadeBox,heartBox,flushBox);
        root.setBottom(hSpecialCardBox);

        Scene scene = new Scene(root, 1000, 700);
        scene.getStylesheets().add("style.css");

        primaryStage.setTitle("Card game ultimate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleClick() {
        playingCardDeck.shuffle();
        cardSlot1.setText("?");
        cardSlot2.setText("?");
        cardSlot3.setText("?");
        cardSlot4.setText("?");
        cardSlot5.setText("?");

        queenSpadeBox.setText("Queen spade status: false");
        heartBox.setText("Cards that are heart: ");
        flushBox.setText("Flush status: ");
    }
    private void handleClick2() {
        cardSlot1.setText(playingCardDeck.getCardBasedOnIndex(0).getAsString());
        cardSlot2.setText(playingCardDeck.getCardBasedOnIndex(1).getAsString());
        cardSlot3.setText(playingCardDeck.getCardBasedOnIndex(2).getAsString());
        cardSlot4.setText(playingCardDeck.getCardBasedOnIndex(3).getAsString());
        cardSlot5.setText(playingCardDeck.getCardBasedOnIndex(4).getAsString());

        checkAfterSpecialCards();
    }

    private void checkAfterSpecialCards () {
        if (cardEvaluator.checkIfFlush()) {

        }
        if (cardEvaluator.checkIfQueenSpade()) {

        }
        if (cardEvaluator.checkIfHeart()) {

        }
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
