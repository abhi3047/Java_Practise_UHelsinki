import java.util.*;


public class Hand implements Comparable<Hand> {
    private List<Card> cardList;

    public Hand(){
        this.cardList=new ArrayList<>();
    }

    public void add(Card card){
        this.cardList.add(card);

    }

    public void print(){
        Iterator<Card> iterator=cardList.iterator();
        while (iterator.hasNext()){
            Card card=iterator.next();
            System.out.println(card);

        }
    }

    public void sort(){
        Collections.sort(cardList);
    }

    public int getSumOfValues(){
        int sum=0;
        for(Card card:cardList){
            sum+=card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        return this.getSumOfValues()-o.getSumOfValues();
    }

    public void sortBySuit(){
        BySuitInValueOrder suitInValueOrderLogic = new BySuitInValueOrder();
        Collections.sort(cardList, suitInValueOrderLogic);
    }
}
