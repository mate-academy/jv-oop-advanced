package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        int random = new Random().nextInt(5);
        switch (random) {
            case 1:
                Figure f1 = new Circle(
                        "Circle", myRandom(), ColorSupplier.getRandomColor());
                return f1;
            case 2:
                Figure f2 = new IsoscelesTrapezoid("IsoscelesTrapezoid",
                        myRandom(), myRandom(), myRandom(), ColorSupplier.getRandomColor());
                return f2;
            case 3:
                Figure f3 = new Rectangle(
                        "Rectangle", myRandom(), myRandom(), ColorSupplier.getRandomColor());
                return f3;
            case 4:
                Figure f4 = new RightTriangle(
                        "RightTriangle", myRandom(), myRandom(), ColorSupplier.getRandomColor());
                return f4;
            default:
                Figure f5 = new Square(
                        "Square", myRandom(), ColorSupplier.getRandomColor());
                return f5;

        }
    }

    private static int myRandom() {
        return new Random().nextInt(5);
    }
}
