package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureType[] figureTypes = FigureType.values();

    public Figure getRandomFigure() {
        FigureType type = figureTypes[random.nextInt(figureTypes.length)];
        Figure figure;

        switch (type) {
            case CIRCLE:
                figure = createRandomCircle();
                break;
            case SQUARE:
                figure = createRandomSquare();
                break;
            case ISOSCELES_TRAPEZOID:
                figure = createRandomIsoscelesTrapezoid();
                break;
            case RECTANGLE:
                figure = createRandomRectangle();
                break;
            case RIGHT_TRIANGLE:
                figure = createRandomRightTriangle();
                break;
            default:
                return getDefaultFigure();
        }
        figure.setColor(colorSupplier.getColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(DEFAULT_RADIUS);
        figure.setColor(Color.WHITE.name());
        return figure;
    }

    private Figure createRandomCircle() {
        return new Circle(getRandomLength());
    }

    private Figure createRandomSquare() {
        return new Square(getRandomLength());
    }

    private Figure createRandomIsoscelesTrapezoid() {
        int rightLegLength = getRandomLength();
        int leftLegLength = rightLegLength;
        int upperBase = getRandomLength();
        int downBase = upperBase + upperBase;
        return new IsoscelesTrapezoid(rightLegLength,leftLegLength,upperBase,downBase);
    }

    private Figure createRandomRectangle() {
        int height = getRandomLength();
        int width = getRandomLength();
        return new Rectangle(height,height,width,width);
    }

    private Figure createRandomRightTriangle() {
        int leg = getRandomLength();
        int hypotenuse = leg * 2;
        return new RightTriangle(leg, hypotenuse);
    }

    private int getRandomLength() {
        return random.nextInt(DEFAULT_RADIUS, MAX_VALUE);
    }
}
