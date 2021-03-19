public class Item {
    private String product;
    private int qty;
    private int unitPrice;


    public Item(String product, int qty, int unitPrice){
        this.product=product;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public int price(){
        int price=this.qty*this.unitPrice;
        return price;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public String toString(){
        String text=this.product+": "+this.qty;
        return text;
    }

    public void increaseQuantity() {
        this.qty+=1;
    }
}
