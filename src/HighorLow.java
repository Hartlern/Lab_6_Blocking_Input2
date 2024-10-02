import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        int guess = 0;
        Random random = new Random();
        int randomNumber = random.nextInt( 10 ) + 1;

        do
        {
            System.out.print( "enter your guess 1-10 (only integers) " );
            if( scan.hasNextInt() )
            {
                guess = scan.nextInt();
                if( guess <= 0 )
                {
                    System.out.println( "Please input a positive number or 0" );
                }
            }
            else
            {
                System.out.println( "Please input a valid number" );
                scan.nextLine();
            }
        } while( guess <= 0 );

        if( guess == randomNumber )
        {
            System.out.println( "\nRandom integer between 1 and 10: " + randomNumber );
            System.out.println( "Your guess between 1 and 10: " + guess );
            System.out.println( "\nYou guessed Right!" );
        }
        else if( guess > randomNumber )
        {
            System.out.println( "\nRandom integer between 1 and 10: " + randomNumber );
            System.out.println( "Your guess between 1 and 10: " + guess );
            System.out.println( "\n you guessed high :(" );
        }
        else
        {
            System.out.println( "\nRandom integer between 1 and 10: " + randomNumber );
            System.out.println( "Your guess between 1 and 10: " + guess );
            System.out.println( "\n you guessed low :(" );
        }
    }
}
