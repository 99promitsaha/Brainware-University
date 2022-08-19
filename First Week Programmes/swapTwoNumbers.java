import java.util.Scanner;

public class swapTwoNumbers {
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;

        System.out.println("First Number: "+a);
        System.out.println("Second Number: "+b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int first = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int second = sc.nextInt();
        swap (first, second);
    }
}
