/*
 * GeometricShapes
 * Program drawing rectangles or circles using classes
 * Author: Michael Muehlberger
 * Last Change: 07.12.2022
 */

import java.lang.Math;

public class Circle {

    Point center = new Point();
    private int radius;
    private static int circleAmnt;

    Circle() {
        circleAmnt++;
    }

    // returns amount of circles
    public int amount() {
        return circleAmnt;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    //returns area of circle
    public double area() {

        double area = Math.PI * radius * radius;
        return area;
    }

    //draws a circle
    public void draw() {

        //first line
        circleLine();

        //spaces
        for (int i = 1; i <= radius; i++) {
            System.out.print("\n");
        }

        //middle line
        int lastLine = 3 + ((radius * 2 * 2) + 2) + 1;
        int xCenter = 3 + (radius * 2) + 1;

        for (int i = 1; i <= lastLine - 1; i++) {

            if (i == 3) {
                System.out.print("|");
            } else if (i == (lastLine - 1)) { //-1 because of ::
                System.out.println("|");
            } else if (i == xCenter) {
                System.out.print("::");
            } else {
                System.out.print(" ");
            }

        }

        //spaces
        for (int i = 1; i <= radius; i++) {
            System.out.print("\n");
        }

        //last line
        circleLine();

    }

    //draws top or bottom line of circle
    private void circleLine() {

        int xCenter = 3 + (radius * 2) + 1;
        for (int i = 1; i <= xCenter; i++) {
            if (i == xCenter) {
                System.out.print("--\n");
            } else {
                System.out.print(" ");
            }
        }
    }

}
