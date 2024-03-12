package no.ntnu.idatx2003.oblig3.cardgame;

/**
 * Class for checking deck of cards after specific cards or card types.
 *
 * @author Tobias Olsen Reiakvam
 */
public class CardEvaluator {

    /**
     * Method that checks if 2 cards are equal type.
     *
     * @param inputCard1 First card that will be put up against card 2.
     * @param inputCard2 Second card that will be put up against card 1.
     * @return equal a boolean that's true if the cards are equal.
     */
    public boolean checkForEqualTypeCards (PlayingCard inputCard1, PlayingCard inputCard2) {
        boolean equal = false;
        if (inputCard1.getSuit() == inputCard2.getSuit()) {equal = true;};
        return equal;
    }

    /**
     * Method that checks if card is type heart.
     *
     * @param inputCard card that will be checked.
     * @return heart that is true if the card is heart.
     */
    public boolean checkIfHeart (PlayingCard inputCard) {
        boolean heart = false;
        if (inputCard.getSuit() == 'H') {heart = true;};
        return heart;
    }

    /**
     * Method that checks if card is queen spade.
     *
     * @param inputCard card that will be checked.
     * @return queenSpade that is true if the card is queen spade.
     */
    public boolean checkIfQueenSpade (PlayingCard inputCard) {
        boolean queenSpade = false;
        if (inputCard.getSuit() == 'S' && inputCard.getFace() == 12) {queenSpade = true;};
        return queenSpade;
    }
}
