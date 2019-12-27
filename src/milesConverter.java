import java.util.Scanner;
import java.lang.Math;

// create a method called miles converter
public class milesConverter {

    //
    public static void main(String[] args) {
        // asking user to enter how much they drove today in kilometers per hour
        System.out.println("Enter how much you drove in kph today: ");
        // gets the input from user
        Scanner inputKph = new Scanner(System.in);
        // now we will check if the input is a number or not
        // If it is then the code makes sure if it is a positive entry or not
        double kph = inputKph.nextDouble();
        // in order to make sure it is a positive entry we will do a while loop
        while(kph < 0)
        {
            System.out.println("Invalid number: Enter a positive number please: ");
            kph = inputKph.nextDouble();
        }
        milesPerHour(kph);
        inputKph.close();
    }

    // creating a method to convert the Kph into Mph
    public static void milesPerHour(double kilometersPerHour){
        // converting kilometers to miles
        double mph01 = 0.621371 * kilometersPerHour;
        //
        long mph = (long)Math.ceil(mph01);
        System.out.println("This is your driving rate converted to miles per hour" + mph);
    }
}
