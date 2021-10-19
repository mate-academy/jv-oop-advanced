package core.basesyntax;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        return null;
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        return new Circle(color, DEFAULT_CIRCLE_RADIUS);
    }
}
