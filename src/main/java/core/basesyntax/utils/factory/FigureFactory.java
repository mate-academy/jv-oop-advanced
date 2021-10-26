package core.basesyntax.utils.factory;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.utils.ColorSupplier;
import java.util.Random;

public class FigureFactory {
    private static final int MAX_SIDE_A = 50;
    private static final int MAX_SIDE_B = 50;
    private static final int MAX_RADIUS = 45;
    private static final int MAX_HEIGHT = 45;

    public Figure getFigure(FigureTypes type) {
        Figure toReturn = null;
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (type) {
            case CIRCLE:
                toReturn = new Circle(colorSupplier.getRandomColor(), generateRadius());
                break;
            case ISOSCELES_TRAPEZOID:
                toReturn = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        generateSideA(),
                        generateSideB(),
                        generateHeight());
                break;
            case RECTANGLE:
                toReturn = new Rectangle(colorSupplier.getRandomColor(),
                        generateSideA(),
                        generateSideB());
                break;
            case RIGHT_RECTANGLE:
                toReturn = new RightTriangle(colorSupplier.getRandomColor(),
                        generateSideA(),
                        generateHeight());
                break;
            case SQUARE:
                toReturn = new Square(colorSupplier.getRandomColor(), generateSideA());
                break;
            default:
                throw new IllegalArgumentException("Wrong figure type:" + type);
        }
        return toReturn;
    }

    private int generateSideA() {
        return (new Random().nextInt(MAX_SIDE_A));
    }

    private int generateSideB() {
        return (new Random().nextInt(MAX_SIDE_B));
    }

    protected int generateRadius() {
        return (new Random().nextInt(MAX_RADIUS));
    }

    private double generateHeight() {
        return (new Random().nextInt(MAX_HEIGHT));
    }
}
