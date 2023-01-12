package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        Square square = new Square(supplier.getRandomColor(), Square.Max_Value);
        Circle circle = new Circle(supplier.getRandomColor(), Circle.Max_Value);
        Rectangle rectangle = new Rectangle(supplier.getRandomColor(), Rectangle.Max_Value, Rectangle.Max_Value);
        System.out.println(square);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
