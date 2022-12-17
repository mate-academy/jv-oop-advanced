package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randNum = random.nextInt(5);
        switch (randNum) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(100));
            case (1):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (2):
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (3):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (4):
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(100));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}

