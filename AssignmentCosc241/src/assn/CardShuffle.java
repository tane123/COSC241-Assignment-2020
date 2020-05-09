package assn;
public class CardShuffle implements CardPile {
    protected int[] original;
    protected int[] deck;

    public void load(int[] cards){
        deck = new int[cards.length];
        for (int i = 0; i < cards.length; i++){
            original[i] = cards[i];
        }
        System.arraycopy(original, 0, deck, 0, cards.length); // creates copy, for loop better?
    }


    public void load(int n) {
        deck = new int[n];
        System.arraycopy(deck, 0, original, 0, deck.length); // creates copy, for loop better?

    }

    public int[] getPile() {

    }


    public void transform(int rowLength, String spec) {

    }


    public int count(int rowLength, String spec) {
        return 0;
    }

}
