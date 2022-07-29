package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE_OF_PARAM = 25;
    public static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE_OF_PARAM));
            case 1:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                         new Random().nextInt(MAX_VALUE_OF_PARAM),
                        new Random().nextInt(MAX_VALUE_OF_PARAM),
                        new Random().nextInt(MAX_VALUE_OF_PARAM));
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE_OF_PARAM),
                        new Random().nextInt(MAX_VALUE_OF_PARAM));
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE_OF_PARAM),
                        new Random().nextInt(MAX_VALUE_OF_PARAM));
            default:
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(MAX_VALUE_OF_PARAM));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, Circle.DEFAULT_RADIUS);
    }
}
