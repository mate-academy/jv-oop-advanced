package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String colorRandom = colorSupplier.getRandomColor();
        int randomUnits = random.nextInt(10) + 1;
        switch (figureNumber) {
            case 0:
                return new Square(colorRandom,randomUnits);
            case 1:
                return new Rectangle(colorRandom, randomUnits, randomUnits);
            case 2:
                return new RightTriangle(colorRandom, randomUnits, randomUnits);
            case 3:
                return new Circle(colorRandom, randomUnits);
            case 4:
                return new IsoscelesTrapezoid(colorRandom, randomUnits, randomUnits, randomUnits);
            default:
                return getDefaultFigure();
        }
    }
}
