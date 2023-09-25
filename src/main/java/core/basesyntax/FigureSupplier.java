package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANGE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(NUMBER_OF_FIGURES);
        String randomColor = colorSupplier.getRandomColor();
        int randomParameterA = random.nextInt(MAX_RANGE);
        int randomParameterB = random.nextInt(MAX_RANGE);
        int randomParameterC = random.nextInt(MAX_RANGE);

        switch (indexOfFigure) {
            case 0:
                return new Square(randomParameterA, randomColor);
            case 1:
                return new Rectangle(randomParameterA, randomParameterB, randomColor);
            case 2:
                return new RightTriangle(randomParameterA, randomParameterB, randomColor);
            case 3:
                return new Circle(randomParameterA, randomColor);
            default:
                return new IsoscelesTrapezoid(randomParameterA, randomParameterB,
                           randomParameterC, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
