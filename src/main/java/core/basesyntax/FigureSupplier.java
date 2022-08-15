package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int numberOfFigures = 4; // start count from zero
    public static final int maxValuesOfUnits = 10;
    public static final int minValuesOfUnits = 1;
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(numberOfFigures)) {
            case (0):
                return getSquare();
            case (1):
                return getRectangle();
            case (2):
                return getRightTriangle();
            case (3):
                return getCircle();
            case (4):
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getSquare() {
        return new Square((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getRectangle() {
        return new Rectangle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getRightTriangle() {
        return new RightTriangle(
                (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getCircle() {
        return new Circle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                new ColorSupplier().getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

}
