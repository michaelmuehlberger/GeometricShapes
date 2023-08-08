/*
 * GeometricShapes
 * Program drawing rectangles or circles using classes
 * Author: Michael Muehlberger
 * Last Change: 07.12.2022
 */

import java.util.Locale;
import java.util.Scanner;

public class GeometricShapes {

    //scanning input function
    static int scanFunction(Scanner scanner, String enterString) {

        int num = -1;

        while (true) {

            System.out.print(enterString);

            if (scanner.hasNextInt()) {

                num = scanner.nextInt();

                if (scanner.nextLine().equals("")) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
        }
        return num;
    }

    // prints a line
    static void printLines() {

        for (int i = 1; i <= 80; i++) {

            if (i == 80) {
                System.out.println("-");
            } else {
                System.out.print("-");
            }
        }

    }

    // prints menu
    static void printMenu() {
        printLines();
        System.out.println("Available commands:");
        System.out.println("  \"New rectangle\" - create new rectangle");
        System.out.println("  \"New circle\" - create new circle");
        System.out.println("  \"Quit\" - quit program");
        printLines();
        System.out.print("> ");
    }

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner scanner = new Scanner(System.in);
        String inputText = "";
        int amount;
        int width;
        int height;
        int radius;
        double area;


        while (true) {

            printMenu();

            inputText = scanner.nextLine();

            if (inputText.equalsIgnoreCase("New rectangle")) {
                Rectangle rectangle = new Rectangle();
                amount = rectangle.amount();
                System.out.printf("Rectangle #%d:\n", amount);

                String enterString1 = "  First point:  x coordinate: ";
                String enterString2 = "  First point:  y coordinate: ";
                String enterString3 = "  Second point: x coordinate: ";
                String enterString4 = "  Second point: y coordinate: ";

                rectangle.point1.setxCoordinate(scanFunction(scanner, enterString1));
                rectangle.point1.setyCoordinate(scanFunction(scanner, enterString2));
                rectangle.point2.setxCoordinate(scanFunction(scanner, enterString3));
                rectangle.point2.setyCoordinate(scanFunction(scanner, enterString4));

                width = rectangle.width();
                height = rectangle.height();
                area = rectangle.area();

                System.out.printf("  Width: %d\n", width);
                System.out.printf("  Height: %d\n", height);
                System.out.printf("  Area: %.2f\n", area);

                if (area > 0) {
                    rectangle.draw();
                }

            } else if (inputText.equalsIgnoreCase("New circle")) {
                Circle circle = new Circle();
                amount = circle.amount();
                System.out.printf("Circle #%d:\n", amount);

                String enterCString1 = "  Center: x coordinate: ";
                String enterCString2 = "  Center: y coordinate: ";

                circle.center.setxCoordinate(scanFunction(scanner, enterCString1));
                circle.center.setyCoordinate(scanFunction(scanner, enterCString2));

                radius = -1;

                while (radius < 0) {
                    radius = scanFunction(scanner, "  Radius: ");
                    circle.setRadius(radius);
                }

                area = circle.area();
                radius = circle.getRadius();

                int circX = circle.center.getxCoordinate();
                int circY = circle.center.getyCoordinate();

                System.out.printf("  Center: (%d,%d)\n", circX, circY);
                System.out.printf("  Radius: %d\n", radius);
                System.out.printf("  Area: %.2f\n", area);

                if (area > 0) {
                    circle.draw();
                }

            } else if (inputText.equalsIgnoreCase("Quit")) {
                scanner.close();
                break;
            }
        }
    }
}
