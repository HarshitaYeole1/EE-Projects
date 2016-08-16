import java.util.Scanner;

/**
 * Created by harshita on 14/8/16.
 */
public class Patterns {

    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String args[])
    {

        System.out.println("Project 1 written By Harshita.");
        System.out.println("Pattern 1: ");
        int NumberOfBoxes;

        System.out.println("Enter the number of boxes: ");
        NumberOfBoxes=CONSOLE.nextInt();

        PrintBox printBox= new PrintBox(NumberOfBoxes);
        //Implementation in one function
        printBox.drawBox();

        //Dividing implementation into two functions
        printBox.DrawFirstAndLastLineOfTheBox();
        printBox.DrawMiddleLinesOfTheBox();
        printBox.DrawFirstAndLastLineOfTheBox();


        System.out.println("Pattern 2: ");

        System.out.println("Enter width of the pattern: ");
        int width=CONSOLE.nextInt();
        System.out.println("Enter height of the pattern: ");
        int height=CONSOLE.nextInt();

        Polygon polygon=new Polygon(width,height);
        polygon.DrawPolygonPattern();




    }
}





