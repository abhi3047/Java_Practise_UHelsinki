
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public void reduceBalance(double amount){
        this.balance=this.balance-amount;
    }

    public boolean takeMoney(double amount){
        if (this.balance>=amount){
            this.reduceBalance(amount);
            return true;
        }

        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        return false;
    }



        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

