import java.util.Scanner;

public class maxOfThreeNumbers {
    public static int Compare (int a, int b, int c){
        int first = a;
        int second = b;
        int third = c;

        if (first>second && first>third){
            return (first);
        }
        else if (second>first && second>third){
            return(second);
        }
        else{
            return (third);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int first = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int second = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int third = sc.nextInt();

        int compare = Compare(first, second, third);

        System.out.println("The max of 3 numbers is: "+ compare);
    }
}
