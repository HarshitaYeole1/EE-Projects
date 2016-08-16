/**
 * Created by harshita on 14/8/16.
 */
class Polygon {

    private int width;
    private int height;

    public Polygon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void DrawPolygonPattern()
    {
        for (int i = 0; i < width; i++)
        {
            System.out.print(" __   ");
        }

        for (int k = 0; k < height; k++) {

            System.out.println();
            for (int i = 1; i <= width; i++) {
                if (i == width) {
                    System.out.print("/  \\");
                } else {
                    System.out.print("/  \\__");
                }

            }
            System.out.println();
            for (int i = 0; i < width; i++) {
                System.out.print("\\__/  ");
            }

        }

    }
}


