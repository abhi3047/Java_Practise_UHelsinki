
public class Main {

    public static void main(String[] args) {

        CustomTacoBox customTacoBox = new CustomTacoBox(5);
        System.out.println(customTacoBox.tacosRemaining());
        for (int i = 1; i <= 3; i++) {
            customTacoBox.eat();
            // Test your code here!
        }
        System.out.println(customTacoBox.tacosRemaining());

    }
}
