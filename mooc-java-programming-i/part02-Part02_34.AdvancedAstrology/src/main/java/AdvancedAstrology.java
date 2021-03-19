
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i=1;i<=number;i++){
            System.out.print("*");
        }
        System.out.println();
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        for (int i=1;i<=number;i++){
            System.out.print(" ");
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        for (int row =1;row<=size;row++){
            printSpaces(size-row);
            printStars(row);
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        int star=1;
        for (int row=1;row<=height;row++){
            printSpaces(height-row);
            printStars(star);
            star+=2;
        }
        int base=1;
        while (base<=2){
            printSpaces(height-2);
            printStars(3);
            base+=1;

        }
        // part 3 of the exercise
    }

    public static void printDiamond(int height){
        int star=1;
        for (int row=1;row<=height;row++){
            printSpaces(height-row);
            printStars(star);
            star+=2;
        }
        star=star-2;
        for (int row=1;row<=height;row++){
            printSpaces(row);
            printStars(star-2);
//            printSpaces(row);

            star-=2;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        System.out.println("----");
        printDiamond(6);
    }
}
