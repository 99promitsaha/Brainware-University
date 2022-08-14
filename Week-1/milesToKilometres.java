import java.util.Scanner;

public class milesToKilometres {

    public static double convert(double a){
        double km = a*1.6000;
        return (km);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value in Miles to Convert in Kilometres: ");

        double miles = sc.nextDouble();

        double km = convert(miles);

        System.out.println("Distance in Kilometres: "+ km + " km");
    }
}
