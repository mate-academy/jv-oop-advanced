package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();
        double randomValue1 = random.nextDouble() * 10 + 1;
        double randomValue2 = random.nextDouble() * 10 + 1;
        double randomValue3 = random.nextDouble() * 10 + 1;

        switch (figureType) {
            case 0:
                return new Circle(color, randomValue1);
            case 1:
                return new Rectangle(color, randomValue1, randomValue2);
            case 2:
                return new Square(color, randomValue1);
            case 3:
                return new RightTriangle(color, randomValue1, randomValue2);
            case 4:
                return new IsoscelesTrapezoid(color, randomValue1, randomValue2, randomValue3);
            default:
                return new Circle(color, randomValue1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
