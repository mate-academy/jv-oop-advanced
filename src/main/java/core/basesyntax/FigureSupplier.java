package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[randomFigure]) {
            case Isosceles_Trapezoid:
                return getIsoscelesTrapezoid();
            case Rectangle:
                return getRectangle();
            case Square:
                return getSquare();
            case Right_Triangle:
                return getRightTriangle();
            case Circle:
                return getCircle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRectangle() {
        double firstSide = random.nextInt(MAX_VALUE);
        double secondSide = random.nextInt(MAX_VALUE);
        return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
    }

    private Figure getIsoscelesTrapezoid() {
        double lowSide = random.nextInt(MAX_VALUE);
        double topSide = random.nextInt(MAX_VALUE);
        double lateralSide = random.nextInt(MAX_VALUE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), lowSide, topSide, lateralSide);
    }

    private Figure getRightTriangle() {
        double base = random.nextInt(MAX_VALUE);
        double height = random.nextInt(MAX_VALUE);
        return new RightTriangle(colorSupplier.getRandomColor(), base, height);
    }
}
