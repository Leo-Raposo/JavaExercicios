package ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.println("--------------------");
            System.out.println("Choose an operation:");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Triangle");
            System.out.println("4. Area of Circle");
            System.out.println("5. Volume of Cube");
            System.out.println("6. Volume of Rectangular Prism");
            System.out.println("7. Area of Trapezoid");
            System.out.println("8. Volume of Sphere");
            System.out.println("9. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the side of the square: ");
                    double sideSquare = sc.nextDouble();
                    System.out.println("Area of Square: " + Geometry.areaSquare(sideSquare));
                    break;
                case 2:
                    System.out.print("Enter the width of the rectangle: ");
                    double widthRectangle = sc.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    double heightRectangle = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + Geometry.areaRectangle(widthRectangle, heightRectangle));
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double baseTriangle = sc.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double heightTriangle = sc.nextDouble();
                    System.out.println("Area of Triangle: " + Geometry.areaTriangle(baseTriangle, heightTriangle));
                    break;
                case 4:
                    System.out.print("Enter the radius of the circle: ");
                    double radiusCircle = sc.nextDouble();
                    System.out.println("Area of Circle: " + Geometry.areaCircle(radiusCircle));
                    break;
                case 5:
                    System.out.print("Enter the side of the cube: ");
                    double sideCube = sc.nextDouble();
                    System.out.println("Volume of Cube: " + Geometry.volumeCube(sideCube));
                    break;
                case 6:
                    System.out.print("Enter the length of the rectangular prism: ");
                    double lengthRectangularPrism = sc.nextDouble();
                    System.out.print("Enter the width of the rectangular prism: ");
                    double widthRectangularPrism = sc.nextDouble();
                    System.out.print("Enter the height of the rectangular prism: ");
                    double heightRectangularPrism = sc.nextDouble();
                    System.out.println("Volume of Rectangular Prism: " + Geometry.volumeRectangularPrism(lengthRectangularPrism, widthRectangularPrism, heightRectangularPrism));
                    break;
                case 7:
                    System.out.print("Enter the first base of the trapezoid: ");
                    double base1Trapezoid = sc.nextDouble();
                    System.out.print("Enter the second base of the trapezoid: ");
                    double base2Trapezoid = sc.nextDouble();
                    System.out.print("Enter the height of the trapezoid: ");
                    double heightTrapezoid = sc.nextDouble();
                    System.out.println("Area of Trapezoid: " + Geometry.areaTrapezoid(base1Trapezoid, base2Trapezoid, heightTrapezoid));
                    break;
                case 8:
                    System.out.print("Enter the radius of the sphere: ");
                    double radiusSphere = sc.nextDouble();
                    System.out.println("Volume of Sphere: " + Geometry.volumeSphere(radiusSphere));
                    break;
                case 9:
                    continueCalculations = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
