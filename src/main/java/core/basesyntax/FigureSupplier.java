package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int QUANITY_OF_TYPES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();
    private Random random = new Random();
    private int figureType = random.nextInt(QUANITY_OF_TYPES);

    private Circle preparedCirce() {
        return new Circle(color,
                (double) Math.round(random.nextDouble() * 100) / 100);
    }

    private IsoscelesTrapezoid preparedTrapezoid() {
        return new IsoscelesTrapezoid(color,
                (double) Math.round(random.nextDouble() * 100) / 100,
                (double) Math.round(random.nextDouble() * 100) / 100,
                (double) Math.round(random.nextDouble() * 100) / 100);
    }

    private Rectangle preparedRectangle() {
        return new Rectangle(color,
                (double) Math.round(random.nextDouble() * 100) / 100,
                (double) Math.round(random.nextDouble() * 100) / 100);
    }

    private RightTriangle preparedTriangle() {
        return new RightTriangle(color,
                (double) Math.round(random.nextDouble() * 100) / 100,
                (double) Math.round(random.nextDouble() * 100) / 100);
    }

    private Square preparedSquare() {
        return new Square(color,
                (double) Math.round(random.nextDouble() * 100) / 100);
    }

    public Figure getRandomFigure() {
        switch (figureType) {
            case 0:
                return preparedCirce();
            case 1:
                return preparedTrapezoid();
            case 2:
                return preparedRectangle();
            case 3:
                return preparedTriangle();
            case 4:
                return preparedSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
