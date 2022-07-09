package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int countOfFigures = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(countOfFigures);
        if (figureNumber == 0) {
            return new Square(colorSupplier.getRandomColor(), getRandomDouble());
        }
        if (figureNumber == 1) {
            return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                    getRandomDouble());
        }
        if (figureNumber == 2) {
            return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                    getRandomDouble());
        }
        if (figureNumber == 3) {
            return new Circle(colorSupplier.getRandomColor(),
                    getRandomDouble());
        } else {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                    getRandomDouble(), getRandomDouble());
        }
    }

    public double getRandomDouble() {
        return random.nextDouble();
    }

    public Figure getDefaultFigure() {
        Color white = Color.WHITE;
        return new Circle(white.name(), 10);
    }
}
