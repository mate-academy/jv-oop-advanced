package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIZE_OF_PARAMETER = 100.0;
    private static final double DEFAULT_CIRCLE_RADIUS = 10.0;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(figureColor, getParameter());
            case 1:
                return new IsoscelesTrapezoid(figureColor, getParameter(), getParameter());
            case 2:
                return new Rectangle(figureColor, getParameter(), getParameter());
            case 3:
                return new RightTriangle(figureColor, getParameter(), getParameter());
            default:
                return new Square(figureColor, getParameter());
        }
    }

    private double getParameter() {
        return random.nextDouble() * MAX_SIZE_OF_PARAMETER;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_CIRCLE_RADIUS);
    }
}
