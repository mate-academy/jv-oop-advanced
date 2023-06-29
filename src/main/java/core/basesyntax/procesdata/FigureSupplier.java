package core.basesyntax.procesdata;

import core.basesyntax.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE_SIZE = 30;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomSize() {
        return random.nextInt(MAX_SIDE_SIZE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(COUNT_OF_FIGURE);
        switch (index) {
            case 0:
                return new Circle(getRandomSize(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomSize(), getRandomSize(),
                        colorSupplier.getRandomColor());
            case 4:
                return new Square(getRandomSize(), colorSupplier.getRandomColor());
            default:
                throw new IllegalArgumentException("Illegal figure");

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
