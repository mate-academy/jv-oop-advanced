package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String colorOfFigure = colorSupplier.getRandomColor();
        int numberOfFigure = random.nextInt(5);
        double randomSize = random.nextDouble();
        if (numberOfFigure == 1) {
            return new Circle(colorOfFigure, randomSize);
        }
        if (numberOfFigure == 2) {
            return new Square(colorOfFigure, randomSize);
        }
        if (numberOfFigure == 3) {
            return new RightTriangle(colorOfFigure, randomSize, randomSize);
        }
        if (numberOfFigure == 4) {
            return new Rectangle(colorOfFigure, randomSize, randomSize);
        }
        if (numberOfFigure == 5) {
            return new IsoscelesTrapezoid(colorOfFigure, randomSize, randomSize, randomSize);
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10d);
    }
}
