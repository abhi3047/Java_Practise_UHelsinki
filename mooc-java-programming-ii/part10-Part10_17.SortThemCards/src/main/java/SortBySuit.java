import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {
    public int compare(Card a, Card b){
        return a.getSuit().ordinal() - b.getSuit().ordinal();
    }
}
