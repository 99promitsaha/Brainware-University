import java.util.Scanner;

public class leapYearOrNot {

    public static int check (int a){
        if (a%4==0){
            return (1);
        }
        else {
            return (0);
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to check leap year or not: ");

        int yy = sc.nextInt();

        int check = check(yy);

        if (check==1){
            System.out.println("The Year is a Leap Year: "+ yy);
        }
        else {
            System.out.println("The Year is not a leap year: "+ yy);
        }
    }
}
