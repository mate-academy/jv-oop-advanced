package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int VALUE = 50;
    private static final int DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier color = new ColorSupplier();
        int index = random.nextInt(EnumFigure.values().length);
        switch (EnumFigure.values()[index]) {
            case CIRCLE:
                return new Circle(color.getRandomColor().toString(),
                        random.nextInt(VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color.getRandomColor().toString(),
                        random.nextInt(VALUE),
                        random.nextInt(VALUE),
                        random.nextInt(VALUE));
            case RECTANGLE:
                return new Rectangle(color.getRandomColor().toString(),
                        random.nextInt(VALUE),
                        random.nextInt(VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(color.getRandomColor().toString(),
                        random.nextInt(VALUE),
                        random.nextInt(VALUE));
            case SQUARE:
                return new Square(color.getRandomColor().toString(),
                        random.nextInt(VALUE));
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_VALUE);
    }
}
