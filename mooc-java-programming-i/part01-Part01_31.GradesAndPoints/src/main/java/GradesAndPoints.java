
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int no=Integer.valueOf(in.nextLine());
        if (no<0){
            System.out.println("impossible!");
        }else if(no>=0 && no<=49){
            System.out.println("failed");
        }else if(no >=50 && no <=59){
            System.out.println("1");
        }else if(no>=60 && no<=69){
            System.out.println("2");
        }else if(no>=70 && no<=79){
            System.out.println("3");
        }else if(no>=80 && no<=89){
            System.out.println("4");
        }else if(no>=90 && no<=100){
            System.out.println("5");
        }else if(no>100){
            System.out.println("incredible!");
        }

    }
}
