package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int MAX_NUMBER_OF_FIGURES = 5;
    public static final int MAX_RANDOM_NUMBER = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int random = new Random().nextInt(MAX_NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (random) {
            case 1: { // Triangle
                double base = getRandom();
                double height = getRandom();
                return new RightTriangle(color, base, height);
            }
            case 2: { // Circle
                double radius = getRandom();
                return new Circle(color, radius);
            }
            case 3: { // Rectangle
                double length = getRandom();
                double width = getRandom();
                return new Rectangle(color, length, width);
            }
            case 4: { // Square
                double side = getRandom();
                return new Square(color, side);
            }
            default: { // Isosceles Trapezoid
                double firstBase = getRandom();
                double secondBase = getRandom();
                double height = getRandom();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS);
    }

    private double getRandom() {
        return Math.round(random.nextDouble(MAX_RANDOM_NUMBER) * 10.0) / 10.0;
    }
}
