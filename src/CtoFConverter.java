import java.util.Scanner;

public class CtoFConverter
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "What is the temperature in Celcius?" );
        double tempC;
        String trash;
        if( scan.hasNextDouble() )
        {
            tempC = scan.nextDouble();
            scan.nextLine();
            System.out.println( "your temperature was " + tempC + " degrees Celcius" );
            double tempF = tempC * 9/5 + 32;
            System.out.println("Your temperature is " + tempF + " degrees Farenheit");


        }
        else
        {
            trash = scan.nextLine();
            System.out.println( "\nYou said your temp was " + trash );
            System.out.println( "Run the program again" );
        }
    }
}
