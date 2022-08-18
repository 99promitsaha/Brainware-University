package Second_Week_Programmes;

import java.util.Scanner;

public class factorialOf12 {
    public static int calculate(int a){
        int num = a, result = 1, i;

        for (i=1; i<=num; i++){
            result=result*i;
        }

        return(result);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate Factorial: ");

        int number = sc.nextInt();
        int calc = calculate(number);

        System.out.println("The value of factorial of "+ number+ " is "+ calc);

    }
}