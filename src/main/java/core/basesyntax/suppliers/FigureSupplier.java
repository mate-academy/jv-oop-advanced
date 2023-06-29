package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RAND_GET_FIGURE = 5;
    private static final int MAX_RAND_SIZE = 50;
    private static final int DEFAULT_RADIUS_SIZE = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int rand = random.nextInt(MAX_RAND_GET_FIGURE);
        switch (rand) {
            case 0:
                return new Rectangle(randomColor(),
                        randomSize(),randomSize());
            case 1:
                return new RightTriangle(randomColor(),
                        randomSize(),randomSize());
            case 2:
                return new IsoscelesTrapezoid(randomColor(),
                        randomSize(),randomSize(),randomSize());
            case 3:
                return new Circle(randomColor(),
                        randomSize());
            default:
                return new Square(randomColor(),
                        randomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,DEFAULT_RADIUS_SIZE);
    }

    private int randomSize() {
        return random.nextInt(MAX_RAND_SIZE);
    }

    private Color randomColor() {
        return colorSupplier.getRandomColor();
    }
}
