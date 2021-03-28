package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure generateFigure() {
        Random random = new Random();

        int figureNumber = random.nextInt(5);
        switch (figureNumber) {
            case 0:
                return new Square("Square", ColorSupplier.generateColor(), random.nextInt(100));
            case 1:
                return new Rectangle("Rectangle", ColorSupplier.generateColor(),
                        random.nextInt(100), random.nextInt(100));
            case 2:
                return new Circle("Circle", ColorSupplier.generateColor(), random.nextInt(100));
            case 3:
                return new RightTriangle("Triangle", ColorSupplier.generateColor(),
                        random.nextInt(100), random.nextInt(100));
            case 4:
                return new IsoscelesTrapezoid("Trapezoid", ColorSupplier.generateColor(),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100));
            default:
                return null;
        }
    }
}
