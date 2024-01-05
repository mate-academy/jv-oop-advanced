package core.basesyntax;

import core.basesyntax.figures.AbstractFigure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE_VALUE = 100;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int index = random.nextInt(Figure.values().length);
        Figure figureName = Figure.values()[index];

        switch (figureName) {
            case CIRCLE: return getRandomCircle();
            case ISOSCELES_TRAPEZOID: return getRandomIsoscelesTrapezoid();
            case RECTANGLE: return getRandomRectangle();
            case RIGHT_TRIANGLE: return getRandomRightTriangle();
            default : return getRandomSquare();
        }
    }

    private AbstractFigure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(), getRandomSize());
    }

    private AbstractFigure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize());
    }

    private AbstractFigure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize());
    }

    private AbstractFigure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSize());
    }

    private AbstractFigure getRandomCircle() {
        return new Square(colorSupplier.getRandomColor(), getRandomSize());
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE_VALUE + 1);
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_NUMBER);
    }
}
