package no.ntnu.idatx2003.oblig3.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of cards by using a list to store objects of PlayingCard.
 * The class have all functions needed from a deck of cards.
 *
 * @author Tobias Olsen Reiakvam
 */
public class PlayingCardDeck {
    // List of all cards
    private List<PlayingCard> cardDeck;

    // Variable field
    public List<Character> cardTypes;

    /**
     * Sets up the card deck and the array of card types.
     */
    public PlayingCardDeck() {
        this.cardDeck = new ArrayList<>();
        this.cardTypes = new ArrayList<>();

        // Fill in card types.
        this.cardTypes.add('S');
        this.cardTypes.add('H');
        this.cardTypes.add('D');
        this.cardTypes.add('C');

        // Initialize deck of cards
        initializeDeck();
    }

    /**
     * Initializes deck by filling it with n cards * 13.
     * N is based on how many types of cards in cardTypes.
     */
    private void initializeDeck() {
        for (int i = 0; i < cardTypes.size(); i++) {
            for (int j = 1; j <= 13; j++) {
                // Print the product of i and j
                PlayingCard newPlayingCard = new PlayingCard(cardTypes.get(i),j);
                cardDeck.add(newPlayingCard);
            }
        }
    }

    /**
     * Method that shuffles all cards in deck in random order.
     */
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

    /**
     * Function for checking if no cards exist in deck.
     */
    public boolean isEmpty() {
        return cardDeck.isEmpty();
    }

    /**
     * Resets deck of card.
     * Fills it with cards and shuffles it.
     */
    public void reset() {
        cardDeck.clear();
        initializeDeck();
        shuffle();
    }

    /**
     * Returns the size of the deck.
     *
     * @return cardDeck.size() an int that represents the size of the list.
     */
    public int getSizeOfDeck() {
        return cardDeck.size();
    }

    /**
     * Returns the list of cards.
     *
     * @return cardDeck
     */
    public List getDeck() {
        return cardDeck;
    }

    /**
     * Method for clearing the array.
     */
    public void clearArrayList() {
        cardDeck.clear();
    }

    /**
     * Returns the list of cards.
     *
     * @param index and int representing the index of the card you are looking for.
     * @return the card you want based on index.
     */
    public PlayingCard getCardBasedOnIndex(int index) {
        return cardDeck.get(index);
    }

}