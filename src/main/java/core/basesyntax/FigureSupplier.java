package core.basesyntax;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.logic.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double MIN_VALUE = 1.0;
    private static final double MAX_VALUE = 10.0;
    private static final double MIN_BASE_DIFFERENCE = 1.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);

        return switch (figureType) {
            case 0 -> generateSquare(color);
            case 1 -> generateRectangle(color);
            case 2 -> generateRightTriangle(color);
            case 3 -> generateCircle(color);
            case 4 -> generateTrapezoid(color);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        final Color color = Color.WHITE;
        final int radius = 10;
        return new Circle(color, radius);
    }

    private double getRandomValue() {
        return random.nextDouble() * (MAX_VALUE - MIN_VALUE) + MIN_VALUE;
    }

    private Square generateSquare(Color color) {
        double side = getRandomValue();
        return new Square(color, side);
    }

    private Rectangle generateRectangle(Color color) {
        double width = getRandomValue();
        double height = getRandomValue();
        return new Rectangle(color, width, height);
    }

    private RightTriangle generateRightTriangle(Color color) {
        double firstLeg = getRandomValue();
        double secondLeg = getRandomValue();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Circle generateCircle(Color color) {
        double radius = getRandomValue();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid generateTrapezoid(Color color) {
        double lowerBase = getRandomValue() + MIN_BASE_DIFFERENCE;
        double upperBase = random.nextDouble() * (lowerBase - MIN_BASE_DIFFERENCE) + MIN_VALUE;
        double height = getRandomValue();
        return new IsoscelesTrapezoid(color, lowerBase, upperBase, height);
    }
}
