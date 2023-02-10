package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(Figures.values().length);
        switch (Figures.values()[randomFigure]) {
            case Isosceles_Trapezoid:
                return null;
            case Rectangle:
                return getRectangle();
            case Square:
                return getSquare();
            case RightTriangle:
                return null;
            case Circle:
                return getCircle();
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
    public Figure getRectangle() {
        double firstSide = random.nextInt(MAX_VALUE);
        double secondSide = random.nextInt(MAX_VALUE);
        return new Rectangle(colorSupplier.getRandomColor(),firstSide,secondSide);
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_VALUE));
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(),random.nextInt(MAX_VALUE));
    }
}
