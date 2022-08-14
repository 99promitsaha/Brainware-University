import java.util.Scanner;

public class gradingSystem {
    public static char check(double a){
        if (a>=90){
            return ('A');
        }

        else if (a>=80 && a<90){
            return ('B');
        }
        else if (a>=70 && a<80){
            return ('C');
        }
        else if (a>=60 && a<70){
            return ('D');
        }
        else if (a>=40 && a<60){
            return ('E');
        }
        else {
            return ('F');
        }
    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the % of marks received: ");
        double percentage = sc.nextDouble();
        char result = check (percentage);

        System.out.println("Grade "+ result);

    }
}
