package core.basesyntax.supplier;

import core.basesyntax.domain.Circle;
import core.basesyntax.domain.IsoscelesTrapezoid;
import core.basesyntax.domain.Rectangle;
import core.basesyntax.domain.RightTriangle;
import core.basesyntax.domain.Square;
import core.basesyntax.domain.parent.Figure;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        final int figuresAmount = 5;
        return switch (random.nextInt(figuresAmount)) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomSquare();
            case 2 -> getRandomRightTriangle();
            case 3 -> getRandomRectangle();
            case 4 -> getRandomIsoscelesTrapezoid();
            default -> getDefaultFigure();
        };
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue(), getRandomValue());
    }

    public Figure getDefaultFigure() {
        final double defaultRadius = 10;
        final String defaultColor = "WHITE";
        return new Circle(defaultColor, defaultRadius);
    }

    private int getRandomValue() {
        final int boundForRandomValue = 50;
        return random.nextInt(boundForRandomValue);
    }
}
