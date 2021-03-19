
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }
    public int totalPrice(){
        int totalPrice=this.getSquares()*this.pricePerSquare;
        return totalPrice;
    }

    public int getPrincePerSquare() {
        return pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.getSquares()>compared.getSquares()){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int absValue=Math.abs(this.totalPrice()-compared.totalPrice());
        return absValue;
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (this.pricePerSquare>compared.pricePerSquare){
            return true;
        }
        return false;
    }

}
