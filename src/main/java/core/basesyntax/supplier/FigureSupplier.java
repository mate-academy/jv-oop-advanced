package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.figure.enums.Color;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIDE = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final String[] figures =
            new String[]{"Square", "Rectangle", "Triangle", "Circle", "Trapezoid"};

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureRandom = random.nextInt(figures.length);
        String randomColor = colorSupplier.getRandomColor();
        int side1 = getRandomInt(MAX_SIDE);
        int side2 = getRandomInt(MAX_SIDE);
        int side3 = getRandomInt(MAX_SIDE);

        return switch (figures[figureRandom]) {
            case "Square" -> new Square(side1, randomColor);
            case "Rectangle" -> new Rectangle(side1, side2, randomColor);
            case "Triangle" -> new RightTriangle(side1, side2, randomColor);
            case "Circle" -> new Circle(side1, randomColor);
            case "Trapezoid" -> new IsoscelesTrapezoid(side1, side2, side3, randomColor);
            default -> {
                throw new IllegalStateException("It should be impossible");
            }
        };
    }

    private int getRandomInt(int max) {
        return 1 + random.nextInt(max);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
