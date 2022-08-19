package Second_Week_Programmes;

import java.util.Scanner;

public class reverse {
    public static int reverse(int a){
        int num = a;
        int rev = 0;

        while (num>0){
            int rem = num%10;
            rev = (rev*10)+rem;
            num=num/10;
        }

        return(rev);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number to Reverse: ");
        int num = sc.nextInt();
        int reverse = reverse(num);

        System.out.println("Reversed number is "+reverse);
    }   
}
