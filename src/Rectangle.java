/*
 * GeometricShapes
 * Program drawing rectangles or circles using classes
 * Author: Michael Muehlberger
 * Last Change: 07.12.2022
 */

public class
Rectangle {

    private static int rectAmnt;
    Point point1 = new Point();
    Point point2 = new Point();

    Rectangle() {
        rectAmnt++;
    }

    //returns rectangle amount
    public int amount() {
        return rectAmnt;
    }

    //returns value of width
    public int width() {

        int x1 = this.point1.getxCoordinate();
        int x2 = this.point2.getxCoordinate();
        int width = x1 - x2;

        if (width < 0) {
            width = -width;
        }
        return width;
    }

    //returns value of height
    public int height() {

        int y1 = this.point1.getyCoordinate();
        int y2 = this.point2.getyCoordinate();
        int height = y1 - y2;

        if (height < 0) {
            height = -height;
        }
        return height;
    }

    //returns value of area
    public int area() {

        int height = this.height();
        int width = this.width();
        int area = height * width;

        return area;

    }

    //draws rectangle
    public void draw() {

        int height = this.height();
        int width = this.width();
        int area = this.area();

        System.out.print("   ");
        for (int i = 1; i <= (width * 2); i++) {
            System.out.print("-");
        }

        System.out.print("\n");

        while (height > 0)
            for (int i = 1; i <= ((width * 2) + 4); i++) {

                if (i == 3) {
                    System.out.print("|");
                } else if (i == ((width * 2) + 4)) {
                    System.out.println("|");
                    height--;
                } else {
                    System.out.print(" ");
                }
            }

        System.out.print("   ");
        for (int i = 1; i <= (width * 2); i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }
}
