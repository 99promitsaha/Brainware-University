import java.util.Scanner;

public class rectangle {
    public static double area (double length, double breadth) {
        double l = length;
        double b = breadth;
        double area = l*b;

        return (area);
    };

    public static double perimeter (double length, double breadth) {
        double l = length;
        double b = breadth;
        double perimeter = 2*(l+b);

        return (perimeter);
    };
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of the Rectangle: ");
        double breadth = sc.nextDouble();

        double a = area(length, breadth);
        double p = perimeter(length, breadth);

        System.out.println("Area of the Rectangle: "+ a);
        System.out.println("Perimeter of the Rectangle: "+ p);
    }
}
