package core.basesyntax.utils.factory;

import static core.basesyntax.utils.constants.Constant.RandomFigurePropertiesValue.MAX_HEIGHT;
import static core.basesyntax.utils.constants.Constant.RandomFigurePropertiesValue.MAX_RADIUS;
import static core.basesyntax.utils.constants.Constant.RandomFigurePropertiesValue.MAX_SIDE_A;
import static core.basesyntax.utils.constants.Constant.RandomFigurePropertiesValue.MAX_SIDE_B;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.utils.ColorSupplier;
import java.util.Random;

public class FigureFactory {

    public Figure getFigure(FigureTypes type) {
        Figure toReturn = null;
        switch (type) {
            case CIRCLE:
                toReturn = new Circle(ColorSupplier.getRandomColor(), generateRadius());
                break;
            case ISOSCELES_TRAPEZOID:
                toReturn = new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        generateSideA(),
                        generateSideB(),
                        generateHeight());
                break;
            case RECTANGLE:
                toReturn = new Rectangle(ColorSupplier.getRandomColor(),
                        generateSideA(),
                        generateSideB());
                break;
            case RIGHT_RECTANGLE:
                toReturn = new RightTriangle(ColorSupplier.getRandomColor(),
                        generateSideA(),
                        generateHeight());
                break;
            case SQUARE:
                toReturn = new Square(ColorSupplier.getRandomColor(), generateSideA());
                break;
            default:
                throw new IllegalArgumentException("Wrong figure type:" + type);
        }
        return toReturn;
    }

    private static int generateSideA() {
        return (new Random().nextInt(MAX_SIDE_A));
    }

    private static int generateSideB() {
        return (new Random().nextInt(MAX_SIDE_B));
    }

    protected static int generateRadius() {
        return (new Random().nextInt(MAX_RADIUS));
    }

    private static double generateHeight() {
        return (new Random().nextInt(MAX_HEIGHT));
    }
}
