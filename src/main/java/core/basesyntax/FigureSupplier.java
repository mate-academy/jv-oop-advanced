package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String colorOfFigure = colorSupplier.getRandomColor();
        int numberOfFigure = random.nextInt(6);
        if (numberOfFigure == 0) {
            return new Circle(colorOfFigure, random.nextDouble());
        }
        if (numberOfFigure == 1) {
            return new Square(colorOfFigure, random.nextDouble());
        }
        if (numberOfFigure == 2) {
            return new RightTriangle(colorOfFigure, random.nextDouble(), random.nextDouble());
        }
        if (numberOfFigure == 3) {
            return new Rectangle(colorOfFigure, random.nextDouble(), random.nextDouble());
        }
        if (numberOfFigure == 4) {
            return new IsoscelesTrapezoid(colorOfFigure,
                    random.nextDouble(), random.nextDouble(), random.nextDouble());
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10d);
    }
}
