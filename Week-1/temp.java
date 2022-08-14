import java.util.Scanner;

public class temp {

    private static double convert(double temperature) {
        double c = temperature;
        double f = ((c/5)*9)+32;
    
        return (f);
    }

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius: ");

        double temperature = sc.nextDouble();
        double farenheit = convert(temperature);

        System.out.println("Temperature in Farenheit is: "+ farenheit);

    }
}