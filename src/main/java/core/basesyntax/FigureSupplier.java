package core.basesyntax;

public class FigureSupplier {
    public static final int FIGURE_TYPES = 5;
    public static final int SIDE_MAX_VALUE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureCount = 1 + (int) (Math.random() * FIGURE_TYPES);
        int firstSide = 1 + (int) (Math.random() * SIDE_MAX_VALUE);
        int secondSide = 1 + (int) (Math.random() * SIDE_MAX_VALUE);
        int height = 1 + (int) (Math.random() * SIDE_MAX_VALUE);

        switch (figureCount) {
            case 1: return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case 2: return new RightTriangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case 3: return new Circle(colorSupplier.getRandomColor(), firstSide);
            case 4: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    firstSide, secondSide, height);
            default: return new Square(colorSupplier.getRandomColor(), firstSide);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
