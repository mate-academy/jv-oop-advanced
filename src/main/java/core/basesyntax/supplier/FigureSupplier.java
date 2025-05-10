package core.basesyntax.supplier;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_SIZE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Figure getRandomFigure() {
        Figure figure;

        int randomIndex = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[randomIndex];

        switch (figureType) {
            case CIRCLE:
                figure = getRandomCircle();
                break;
            case SQUARE:
                figure = getRandomSquare();
                break;
            case RECTANGLE:
                figure = getRandomRectangle();
                break;
            case TRIANGLE:
                figure = getRandomTriangle();
                break;
            case TRAPEZOID:
                figure = getRandomTrapezoid();
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

    private Circle getRandomCircle() {
        return new Circle(getRandomColor(), getRandomSize());
    }

    private Square getRandomSquare() {
        return new Square(getRandomColor(), getRandomSize());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(getRandomColor(), getRandomSize(), getRandomSize());
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(getRandomColor(), getRandomSize(), getRandomSize());
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(
                getRandomColor(), getRandomSize(), getRandomSize(), getRandomSize());
    }

    private Color getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }
}
