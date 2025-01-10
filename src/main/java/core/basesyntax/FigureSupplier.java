package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int FIGURES_QUANTITY = 5;
    private static final int DEFAULT_RADIUS = 10;
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        final int figureType = new Random().nextInt(FIGURES_QUANTITY);

        double randomValue1 = RANDOM.nextDouble() * 10;
        double randomValue2 = RANDOM.nextDouble() * 10;
        double randomValue3 = RANDOM.nextDouble() * 10;

        switch (figureType) {
            case 0:
                return new Square(color, randomValue1);
            case 1:
                return new Rectangle(color, randomValue1, randomValue2);
            case 2:
                return new RightTriangle(color, randomValue1, randomValue2);
            case 3:
                return new Circle(color, randomValue1);
            case 4:
                return new IsoscelesTrapezoid(color, randomValue1, randomValue2, randomValue3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final Color circleColor = Color.WHITE;
        return new Circle(circleColor, DEFAULT_RADIUS);
    }
}
