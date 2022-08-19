package Second_Week_Programmes;

import java.util.Scanner;

public class fibonacciSeries {
    public static void print(int a){
        int num1=0, num2=1;
        int counter = 0;

        while (counter<a){
            System.out.print(num1+ " ");

            //Swap
            int num3 = num1+num2;
            num1=num2;
            num2=num3;
            counter = counter+1;
        }

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of Fibonacci Numbers ");
        int num = sc.nextInt();
        print(num);
    }
}
