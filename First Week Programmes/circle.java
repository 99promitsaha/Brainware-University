import java.util.Scanner;

public class circle {
    public static double Area (double radius){
        double r = radius;
        double Area = 2*(22/7)*Math.pow(r, 2);
        return(Area);
    };

    public static double Perimeter (double radius){
        double r = radius;
        double Perimeter = 2*(22/7)*r;
        return (Perimeter);
    };
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the Circle: ");
        double radius = sc.nextDouble();

        double Area = Area(radius);
        System.out.println("Area of the Circle is: "+ Area);

        double Perimeter = Perimeter(radius);
        System.out.println("Perimeter of the Circle is: "+ Perimeter);
    }
}
