package model;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        //creating an array with dimensions of figure
        int[] finalInt = new int[3];
        finalInt[0] = random.nextInt(101) + 1;
        finalInt[1] = random.nextInt(101) + 1;
        finalInt[2] = random.nextInt(101) + 1;
        //choosing the figure
        switch (random.nextInt() % 5) {
            case (0):
                // creating circle
                return new Circle(finalInt, colorSupplier.getRandomColor());
            case (1):
                //creating isosceles trapezoid
                return new IsoscelesTrapezoid(finalInt, colorSupplier.getRandomColor());

            case (2):
                //creating rectangle
                return new Rectangle(finalInt, colorSupplier.getRandomColor());

            case (3):
                //creating right triangle
                return new RightTriangle(finalInt, colorSupplier.getRandomColor());

            default:
                //creating square
                return new Square(finalInt, colorSupplier.getRandomColor());

        }
    }
}
