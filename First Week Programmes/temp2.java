import java.util.Scanner;

public class temp2 {

    private static double convert(double temperature) {
        double f = temperature;
        double c = ((f-32)/9)*5;
    
        return (c);
    }

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Farenheit: ");

        double temperature = sc.nextDouble();
        double Celcius = convert(temperature);

        System.out.println("Temperature in Farenheit is: "+ Celcius);

    }
}