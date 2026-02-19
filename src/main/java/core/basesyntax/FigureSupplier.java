package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_SIDE = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final int DEFAULT_HEIGHT = 10;
    private static final int DEFAULT_LEG = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        switch (figureType) {
            case 0:
                int side = DEFAULT_SIDE;
                return new Square(side, color);
            case 1:
                int firstLeg = DEFAULT_LEG;
                int secondLeg = DEFAULT_LEG;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 2:
                int sideA = DEFAULT_SIDE;
                int sideB = DEFAULT_SIDE;
                return new Rectangle(color, sideA, sideB);
            case 3:
                int up = DEFAULT_SIDE;
                int low = DEFAULT_SIDE;
                int height = DEFAULT_HEIGHT;
                return new IsoscelesTrapezoid(color, up, low, height);
            case 4:
                int radius = DEFAULT_RADIUS;
                return new Circle(color, radius);
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure() {
        String color = DEFAULT_COLOR;
        int radius = DEFAULT_RADIUS;
        return new Circle(color, radius);
    }
}