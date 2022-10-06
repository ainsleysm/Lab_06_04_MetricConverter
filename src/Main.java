import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        String trash = "";

        System.out.print("Enter measurement in meters: ");
        if(in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();

            double miles = meters/1609.344;
            double feet = miles * 5280;
            double inches = feet * 12;
            System.out.println("Measurement in miles is: " + miles);
            System.out.println("Measurement in feet is: " + feet);
            System.out.println("Measurement in inches is: " + inches);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid measurement");
        }
    }
}