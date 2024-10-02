import java.util.Scanner;

public class RectangleInfo
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        double height = 0;
        double width = 0;

        do
        {
            System.out.print( "Enter the height of your rectangle: " );
            if( scan.hasNextDouble() )
            {
                height = scan.nextDouble();
                if( height <= 0 )
                {
                    System.out.println( "Please input a positive number" );
                }
            }
            else
            {
                System.out.println( "Please input a valid number" );
                scan.nextLine();
            }
        } while( height <= 0 );

        do
        {
            System.out.print( "Enter the width of your rectangle: " );
            if( scan.hasNextDouble() )
            {
                width = scan.nextDouble();
                if( width <= 0 )
                {
                    System.out.println( "Please input a number above 0" );
                }
            }
            else
            {
                System.out.println( "Please input a valid number" );
                scan.nextLine();
            }
        } while( width <= 0 );

        double area = height * width;
        double perimeter = 2 * height + 2 * width;
        double diagonal = Math.hypot( height, width );
        System.out.println( "\nThe area of the rectangle is " + area );
        System.out.println( "The perimeter of the rectangle is " + perimeter );
        System.out.println( "The hypotenuse of the rectangle is " + diagonal );
    }
}
