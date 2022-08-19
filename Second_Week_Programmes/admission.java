package Second_Week_Programmes;

import java.util.*;

public class admission {
    public static int calculate(double p, double c, double m){
        double total = p+c+m;

        if (m>=60 && p>=50 && c>=40 && total>=200){
            return (1);
        }
        else if (m+p>=150){
            return (1);
        }
        else {
            return (0);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.println("Enter the marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.println("Enter the marks in Maths: ");
        double maths = sc.nextDouble();

        int result = calculate (physics, chemistry, maths);

        if (result==1){
            System.out.println("Eligible for Admission");
        }
        else {
            System.out.println("Not Eligible for Admission");
        }

    }
}
