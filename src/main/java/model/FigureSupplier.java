package model;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        //creating an array with dimensions of figure
        int[] finalInt = new int[3];
        finalInt[0] = random.nextInt(101) + 1;
        finalInt[1] = random.nextInt(101) + 1;
        finalInt[2] = random.nextInt(101) + 1;
        //choosing the figure
        switch (random.nextInt() % 5) {
            case (0):
                // creating circle
                Circle circle = new Circle(ColorSupplier.getRandomColor());
                circle.setParams(finalInt, ColorSupplier.getRandomColor());
                return circle;
            case (1):
                //creating isosceles trapezoid
                IsoscelesTrapezoid trapezoid =
                        new IsoscelesTrapezoid(ColorSupplier.getRandomColor());
                trapezoid.setParams(finalInt, ColorSupplier.getRandomColor());
                return trapezoid;

            case (2):
                //creating rectangle
                Rectangle rectangle = new Rectangle(ColorSupplier.getRandomColor());
                rectangle.setParams(finalInt, ColorSupplier.getRandomColor());
                return rectangle;

            case (3):
                //creating right triangle
                RightTriangle rightTriangle = new RightTriangle(ColorSupplier.getRandomColor());
                rightTriangle.setParams(finalInt, ColorSupplier.getRandomColor());
                return rightTriangle;

            default:
                //creating square
                Square square = new Square(ColorSupplier.getRandomColor());
                square.setParams(finalInt, ColorSupplier.getRandomColor());
                return square;

        }
    }
}
