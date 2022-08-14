import java.util.Scanner;

public class divisibleByFive {
    public static int check(int a){
        if (a%5==0){
            return (1);
        }
        else {
            return (0);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check divisible by 5 or not: ");
        int num = sc.nextInt();

        int check = check (num);

        if (check == 1){
            System.out.println(num + " is divisible by 5");
        }
        else {
            System.out.println(num +" is not divisible by 5");
        }
    }
}
