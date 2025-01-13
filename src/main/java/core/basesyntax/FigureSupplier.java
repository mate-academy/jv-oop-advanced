package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        int index = new Random().nextInt(4);
        switch (index) {
            case 0:
                return new Circle(new Random().nextDouble(50), ColorSupplier.getRandomColor());
            case 1:
                return new Rectangle(new Random().nextDouble(50), new Random().nextDouble(50),
                        ColorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(new Random().nextDouble(50), new Random().nextDouble(50),
                        ColorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(new Random().nextDouble(50),
                        new Random().nextDouble(50),
                        new Random().nextDouble(100), ColorSupplier.getRandomColor());
            case 4:
                return new Square(new Random().nextDouble(100));
            default:
                return null;
        }
    }
}
