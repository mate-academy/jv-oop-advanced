package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int index = new Random().nextInt(4);
        switch (index) {
            case 0:
                return new Circle(new Random().nextDouble(100));
            case 1:
                return new Rectangle(new Random().nextDouble(100), new Random().nextDouble(100));
            case 2:
                return new RightTriangle(new Random().nextDouble(100), new Random().nextDouble(100));
            case 3:
                return new IsoscelesTrapezoid(new Random().nextDouble(100), new Random().nextDouble(100),
                        new Random().nextDouble(100));
            case 4:
                double side = new Random().nextDouble(100);
                return new Square(side, side);
            default:
                return null;
        }
    }
}
