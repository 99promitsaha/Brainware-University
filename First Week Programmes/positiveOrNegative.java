import java.util.Scanner;

public class positiveOrNegative {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check Positive or Negative : ");
        int number = sc.nextInt();

        if (number>0){
            System.out.println("The number is Positive");
        }
        else if (number<0){
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is neither Positive or Negative :)");
        }
    }
}
