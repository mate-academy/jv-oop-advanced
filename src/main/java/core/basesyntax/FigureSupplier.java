package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_FIGURE_QUANTITY = 5;
    static final double FIGURE_RADIUS = 9.0 + 1.0;
    static final String DEFAULT_CIRCLE_COLOUR = "White";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(MAX_FIGURE_QUANTITY);

        switch (randomFigure) {
            case 0:
                return new Circle(figureColor, random.nextDouble() * FIGURE_RADIUS);
            case 1:
                return new IsoscelesTrapezoid(figureColor, random.nextDouble() * FIGURE_RADIUS,
                        random.nextDouble() * FIGURE_RADIUS, random.nextDouble() * FIGURE_RADIUS);
            case 2:
                return new Rectangle(figureColor, random.nextDouble() * FIGURE_RADIUS,
                        random.nextDouble() * FIGURE_RADIUS);
            case 3:
                return new RightTriangle(figureColor, random.nextDouble() * FIGURE_RADIUS,
                        random.nextDouble() * FIGURE_RADIUS);
            case 4:
                return new Square(figureColor, random.nextDouble() * FIGURE_RADIUS);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOUR, FIGURE_RADIUS);
    }
}
