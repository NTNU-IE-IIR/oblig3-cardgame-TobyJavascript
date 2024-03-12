package no.ntnu.idatx2003.oblig3.cardgame;

public class CardEvaluator {

    public boolean checkForEqualTypeCards (PlayingCard inputCard1, PlayingCard inputCard2) {
        boolean equal = false;
        if (inputCard1.getSuit() == inputCard2.getSuit()) {equal = true;};
        return equal;
    }

    public boolean checkIfHeart (PlayingCard inputCard) {
        boolean heart = false;
        if (inputCard.getSuit() == 'H') {heart = true;};
        return heart;
    }

    public boolean checkIfQueenSpade (PlayingCard inputCard) {
        boolean queenSpade = false;
        if (inputCard.getSuit() == 'S' && inputCard.getFace() == 12) {queenSpade = true;};
        return queenSpade;
    }
}
