
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account accountMatthew= new Account("Matthews account",1000);
        Account accountMy= new Account("My account",0);
        accountMatthew.withdrawal(100);
        accountMy.deposit(100);
        System.out.println(accountMatthew);
        System.out.println(accountMy);

        // Do not touch the code in Account.java
        // write your program here
    }
}
