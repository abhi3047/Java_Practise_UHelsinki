public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        // write code here
    }

    public String toString() {
//        System.out.println();
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }

        // write code here
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
        // write code here
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (this.balance + amount <= 150) {
                this.balance = this.balance + amount;
            } else {
                this.balance = 150;
            }

            // write code here
        }

    }
}
