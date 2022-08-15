package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int numberOfFigures = 4; // start count from zero
    public static final int maxValuesOfUnits = 10;
    public static final int minValuesOfUnits = 1;
    private Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        switch (random.nextInt(numberOfFigures)) {
            case (0):
                figure = new Square((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        new ColorSupplier().getRandomColor());
                break;
            case (1):
                figure = new Rectangle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        new ColorSupplier().getRandomColor());
                break;
            case (2):
                figure = new RightTriangle(
                        (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        new ColorSupplier().getRandomColor());
                break;
            case (3):
                figure = new Circle((random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        new ColorSupplier().getRandomColor());
                break;
            case (4):
                figure = new IsoscelesTrapezoid(
                        (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        (random.nextInt(maxValuesOfUnits - minValuesOfUnits) + 1),
                        new ColorSupplier().getRandomColor());
                break;
            default:
                figure = new Circle(10, "WHITE");
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

}
