package ex03;

public class Geometry {

    public static double areaSquare(double side) {
        return side * side;
    }

    public static double areaRectangle(double width, double height) {
        return width * height;
    }

    public static double areaTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double volumeCube(double side) {
        return side * side * side;
    }

    public static double volumeRectangularPrism(double length, double width, double height) {
        return length * width * height;
    }

    public static double areaTrapezoid(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }

    public static double volumeSphere(double radius) {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
