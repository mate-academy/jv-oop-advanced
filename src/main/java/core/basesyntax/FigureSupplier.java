package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double BOUND_OF_RANDOM = 100;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final SecureRandom random = new SecureRandom();

    public double getRandomNumber() {
        return random.nextDouble(BOUND_OF_RANDOM);
    }

    public TypeFigure getRandomTypeFigure() {
        int randomFigure = random.nextInt(TypeFigure.values().length);
        return TypeFigure.values()[randomFigure];
    }

    public Figure getRandomFigure() {
        switch (getRandomTypeFigure()) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(),
                        getRandomNumber() * Circle.MAX_RADIUS);
            case SQUARE:
                return new Square(randomColor.getRandomColor(),
                        getRandomNumber() * Square.MAX_SIDE);
            case TRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(),
                        getRandomNumber() * RightTriangle.MAX_FIRST_LEG,
                        getRandomNumber() * RightTriangle.MAX_SECOND_LEG);
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(),
                        getRandomNumber()* Rectangle.MAX_FIRST_SIDE,
                        getRandomNumber() * Rectangle.MAX_SECOND_SIDE);
            case TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        getRandomNumber() * IsoscelesTrapezoid.MAX_HEIGHT,
                        getRandomNumber() * IsoscelesTrapezoid.MAX_UPPER_SIDE,
                        getRandomNumber() * IsoscelesTrapezoid.MAX_LOWER_SIDE);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
