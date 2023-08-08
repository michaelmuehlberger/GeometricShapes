/*
 * GeometricShapes
 * Program drawing rectangles or circles using classes
 * Author: Michael Muehlberger
 * Last Change: 07.12.2022
 */

public class Point {

    private int xCoordinate;
    private int yCoordinate;
    private static int pointAmount;

    public void setCoordinates(int xCoordinate, int yCoordinate) {

        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;

    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

}