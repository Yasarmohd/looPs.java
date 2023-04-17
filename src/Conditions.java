import java.util.Scanner;

public class Conditions {
    public static void main(String args[]){
        Scanner SC= new Scanner(System.in);
        int x =SC.nextInt();

        if (x % 2 == 0) {
            System.out.println("even");
        }
        else {

            System.out.println("odd");
        }


    }
}
