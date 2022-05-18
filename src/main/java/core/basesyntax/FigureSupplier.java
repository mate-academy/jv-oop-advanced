package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_FIGURE = 4;
    private static final int MAX_SIZE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int getRandomSize() {
        int size = random.nextInt(MAX_SIZE);
        return size;
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(MAX_NUMBER_FIGURE);
        return (figure == 0) ? new Circle(colorSupplier.getRandomColor(), getRandomSize())
                : (figure == 1) ? new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(), getRandomSize())
                : (figure == 2) ? new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize())
                : (figure == 3) ? new Square(colorSupplier.getRandomColor(), getRandomSize())
                : new Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
