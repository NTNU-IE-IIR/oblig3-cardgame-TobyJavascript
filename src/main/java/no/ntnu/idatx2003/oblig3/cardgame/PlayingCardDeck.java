package no.ntnu.idatx2003.oblig3.cardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck {
    // List of all cards
    private List<PlayingCard> cardDeck;

    // Variable field
    public List<Character> cardTypes;

    public PlayingCardDeck() {
        this.cardDeck = new ArrayList<>();
        this.cardTypes = new ArrayList<>();
        this.cardTypes.add('S');
        this.cardTypes.add('H');
        this.cardTypes.add('D');
        this.cardTypes.add('C');
        initializeDeck();
    }

    // Initialize the deck with all 52 standard playing cardDeck
    private void initializeDeck() {
        for (int i = 0; i < cardTypes.size(); i++) {
            for (int j = 1; j <= 13; j++) {
                // Print the product of i and j
                PlayingCard newPlayingCard = new PlayingCard(cardTypes.get(i),j);
                cardDeck.add(newPlayingCard);
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cardDeck);
    }

    // Deal a card from the deck
    public PlayingCard dealCard() {
        if (!cardDeck.isEmpty()) {
            return cardDeck.removeFirst();
        } else {
            throw new IllegalStateException("Deck is empty. Cannot deal a card.");
        }
    }

    // Check if the deck is empty
    public boolean isEmpty() {
        return cardDeck.isEmpty();
    }

    // Reset the deck (re-initialize and shuffle)
    public void reset() {
        cardDeck.clear();
        initializeDeck();
        shuffle();
    }

    // Get the number of cardDeck remaining in the deck
    public int getSizeOfDeck() {
        return cardDeck.size();
    }

    // Get the arraylist of cards
    public List getDeck() {
        return cardDeck;
    }

    // Method to clear an ArrayList
    public void clearArrayList() {
        cardDeck.clear();
    }

    // Method for getting card based on index
    public PlayingCard getCardBasedOnIndex(int index) {
        return cardDeck.get(index);
    }

}