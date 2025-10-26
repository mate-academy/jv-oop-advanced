package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_PROPERTY_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = getRandomProperty();
                return new Square(color, side);
            case 1:
                double radius = getRandomProperty();
                return new Circle(color, radius);
            case 2:
                double base = getRandomProperty();
                double height = getRandomProperty();
                return new RightTriangle(color, base, height);
            case 3:
                double length = getRandomProperty();
                double width = getRandomProperty();
                return new Rectangle(color, length, width);
            case 4:
                double topBase = getRandomProperty();
                double bottomBase = getRandomProperty();
                double trapezoidHeight = getRandomProperty();
                return new IsoscelesTrapezoid(color, topBase, bottomBase, trapezoidHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomProperty() {
        return random.nextDouble() * MAX_PROPERTY_VALUE + 1;
    }
}
