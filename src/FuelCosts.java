import java.util.Scanner;

public class FuelCosts
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        double galGas = 0;
        double fuelEfficiency = 0;
        double gasCost = 0;

        do
        {
            System.out.print( "Enter the number of gallons of gas the tank can hold" );
            if( scan.hasNextDouble() )
            {
                galGas = scan.nextDouble();
                if( galGas <= 0 )
                {
                    System.out.println( "Please input a positive number" );
                }
            }
            else
            {
                System.out.println( "Please input a valid number" );
                scan.nextLine();
            }
        } while( galGas <= 0 );

        do
        {
            System.out.print( "Enter the fuel efficiency of your car(x miles / 1 gallon " );
            if( scan.hasNextDouble() )
            {
                fuelEfficiency = scan.nextDouble();
                if( fuelEfficiency <= 0 )
                {
                    System.out.println( "Please input a number above 0" );
                }
            }
            else
            {
                System.out.println( "Please input a valid number" );
                scan.nextLine();
            }
        } while( fuelEfficiency <= 0 );

        do
        {
            System.out.print( "Enter the Cost of gas per gallon " );
            if( scan.hasNextDouble() )
            {
                gasCost = scan.nextDouble();
                if( gasCost <= 0 )
                {
                    System.out.println( "Please input a number above 0" );
                }
            }
            else
            {
                System.out.println( "Please input a valid number" );
                scan.nextLine();
            }
        } while( gasCost <= 0 );

        double milesHundo = 100 / fuelEfficiency * gasCost;
        System.out.println( "\nIt would cost " + milesHundo + " to drive 100 miles" );
        double distancePossible = galGas * fuelEfficiency;
        System.out.println("Your car could travel " + distancePossible + " with a full tank of gas");
    }
}
