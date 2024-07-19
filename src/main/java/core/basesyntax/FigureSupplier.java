package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createCircle(color);
            case 1:
                return createSquare(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createRightTriangle(color);
            case 4:
                return createIsoscelesTrapezoid(color);
            default:
                throw new IllegalArgumentException("Unexpected value: " + figureType);
        }
    }

    private Circle createCircle(String color) {
        return new Circle(color, random.nextDouble() * MAX_SIZE);
    }

    private Square createSquare(String color) {
        return new Square(color, random.nextDouble() * MAX_SIZE);
    }

    private Rectangle createRectangle(String color) {
        return new Rectangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble()
                * MAX_SIZE);
    }

    private RightTriangle createRightTriangle(String color) {
        return new RightTriangle(color, random.nextDouble() * MAX_SIZE, random.nextDouble()
                * MAX_SIZE);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, random.nextDouble() * MAX_SIZE, random.nextDouble()
                * MAX_SIZE, random.nextDouble() * MAX_SIZE);
    }
}
