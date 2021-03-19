import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card a, Card b) {
        if (a.getSuit().ordinal() > b.getSuit().ordinal()){
            return 1;
        }else if(a.getSuit().ordinal() == b.getSuit().ordinal()){
            if(a.getValue()>b.getValue()){
                return 1;
            } else if (a.getValue() == b.getValue()){
                return 0;
            }
            return -1;
        }
        return -1;
//        return a.getSuit().ordinal() - b.getSuit().ordinal();
    }
}
