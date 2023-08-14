package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_PROPERTIES = 5;

    public static final int DEFAULT_CIRCLE_RADIUS = 10;

    private Random randomFigure = new Random();

    private Figure circleDefault = new Circle(DEFAULT_CIRCLE_RADIUS, "white");

    private ColorSupplier colorSupplire = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (randomFigure.nextInt(MAX_RANDOM_PROPERTIES)) {
            case 1:
                return new Circle(4, colorSupplire.getRandomColor());
            case 2:
                return new Square(5, colorSupplire.getRandomColor());
            case 3:
                return new Rectangle(4, 6, colorSupplire.getRandomColor());
            case 4:
                return new RightTriangle(4, 4, colorSupplire.getRandomColor());
            default:
                return new IsoscelesTrapezoid(3, 4, 5, colorSupplire.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return circleDefault;
    }
}
