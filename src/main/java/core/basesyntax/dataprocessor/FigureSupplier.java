package core.basesyntax.dataprocessor;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Figure.Color;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE_SIZE = 50;
    private static final int MIN_SIDE_SIZE = 1;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize(), getRandomSize());
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomSize());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 4:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomSize());
            default:
                throw new IllegalArgumentException("Illegal figure types!");
        }
    }

    private int getRandomSize() {
        return MIN_SIDE_SIZE + random.nextInt(MAX_SIDE_SIZE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }
}
