package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final SecureRandom random = new SecureRandom();


    public TypeFigure getRandomTypeFigure() {
        int randomFigure = random.nextInt(TypeFigure.values().length);
        return TypeFigure.values()[randomFigure];
    }

    public Figure getRandomFigure() {
        switch (getRandomTypeFigure()) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(),
                        random.nextDouble() * Circle.MAX_RADIUS);
            case SQUARE:
                return new Square(randomColor.getRandomColor(),
                        random.nextDouble() * Square.MAX_SIDE);
            case TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(),
                        random.nextDouble() * RightTriangle.MAX_FIRST_LEG,
                        random.nextDouble() * RightTriangle.MAX_SECOND_LEG);
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(),
                        random.nextDouble() * Rectangle.MAX_FIRST_SIDE,
                        random.nextDouble() * Rectangle.MAX_SECOND_SIDE);
            case TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        random.nextDouble() * IsoscelesTrapezoid.MAX_HEIGHT,
                        random.nextDouble() * IsoscelesTrapezoid.MAX_UPPER_SIDE,
                        random.nextDouble() * IsoscelesTrapezoid.MAX_LOWER_SIDE);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
