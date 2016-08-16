/**
 * Created by harshita on 14/8/16.
 */
class PrintBox {

    private

    int NumberOfBoxes;

    public
    PrintBox(int NumBox)
    {
        this.NumberOfBoxes=NumBox;
    }

    public void drawBox()
    {
        System.out.print("+");
        for(int i=0;i<NumberOfBoxes;i++)
        {
            System.out.print("------+");
        }
        System.out.println();

        for (int j=1;j<=2;j++)
        {
            System.out.print("|");
            for (int i=0;i<NumberOfBoxes;i++)
            {

                System.out.print("      |");
            }
            System.out.println();
        }

        System.out.print("+");
        for(int i=0;i<NumberOfBoxes;i++)
        {
            System.out.print("------+");
        }
        System.out.println();
    }

    public void DrawFirstAndLastLineOfTheBox()
    {
        System.out.print("+");
        for(int i=0;i<NumberOfBoxes;i++)
        {
            System.out.print("------+");
        }
        System.out.println();
    }
    public void DrawMiddleLinesOfTheBox()
    {
        for (int j=1;j<=2;j++)
        {
            System.out.print("|");
            for (int i=0;i<NumberOfBoxes;i++)
            {

                System.out.print("      |");
            }
            System.out.println();
        }
    }
}
