package core.basesyntax.suppliers;

import core.basesyntax.colors.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Figures;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_SIZE = 40;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MIN_VALUE = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MIN_VALUE, Figures.values().length + MIN_VALUE);
        switch (index) {
            case 1:
                return new Circle(getRandomSize(), colorSupplier.getRandomColor());
            case 2:
                return new Square(getRandomSize(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomSize(), colorSupplier.getRandomColor());
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize());
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize(), getRandomSize());
            default:
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR);
    }

    public int getRandomSize() {
        return random.nextInt(MIN_VALUE, MAX_SIZE);
    }
}
