package core.basesyntax.service;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.FigureType;
import core.basesyntax.entity.Circle;
import core.basesyntax.entity.IsoscelesTrapezoid;
import core.basesyntax.entity.Rectangle;
import core.basesyntax.entity.RightTriangle;
import core.basesyntax.entity.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_VALUE = 10;
    private static final int MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandom() {
        int randomFigureNumber = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[randomFigureNumber]) {
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case CIRCLE:
                return getRandomCircle();
            case RIGHTTRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELESTRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                getRandomValue(), getRandomValue());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomValue(), getRandomValue());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_VALUE);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_VALUE);
    }
}
