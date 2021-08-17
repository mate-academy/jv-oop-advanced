package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM = new Random().nextInt(5);

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (RANDOM) {
            case 1:
                Figure f1 = new Circle(
                        "Circle", myRandom(), colorSupplier.getRandomColor());
                return f1;
            case 2:
                Figure f2 = new IsoscelesTrapezoid("IsoscelesTrapezoid",
                        myRandom(), myRandom(), myRandom(), colorSupplier.getRandomColor());
                return f2;
            case 3:
                Figure f3 = new Rectangle(
                        "Rectangle", myRandom(), myRandom(), colorSupplier.getRandomColor());
                return f3;
            case 4:
                Figure f4 = new RightTriangle(
                        "RightTriangle", myRandom(), myRandom(), colorSupplier.getRandomColor());
                return f4;
            default:
                Figure f5 = new Square(
                        "Square", myRandom(), colorSupplier.getRandomColor());
                return f5;

        }
    }

    private int myRandom() {
        return new Random().nextInt(5);
    }
}
