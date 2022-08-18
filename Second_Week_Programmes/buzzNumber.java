package Second_Week_Programmes;
import java.util.Scanner;

public class buzzNumber {
    public static int check (int a){
        if (a%10==7 || a%7==0){
            return (1);
        }
        else {
            return (0);
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Buzz Number or Not!");
        int number = sc.nextInt();
        int check = check(number);

        if (check == 1){
            System.out.println(number+ " is a Buzz Number");
        }
        else {
            System.out.println(number + " is not a Buzz Number");
        }
    }
}
