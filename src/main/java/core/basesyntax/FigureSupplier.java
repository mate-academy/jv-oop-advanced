package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_UNIT_LIMIT = 99;
    public static final int MIN_UNIT_LIMIT = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Figure defaultCircle = new Circle(10, String.valueOf(Color.WHITE));

    public Figure getRandomFigure() {
        int counter = random.nextInt(FIGURE_COUNT);
        switch (counter) {
            case 0:
                return new Circle(getRandomValue(), getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(),
                        getRandomValue(), getRandomColor());
            case 2:
                return new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
            case 3:
                return new RightTriangle(getRandomValue(), getRandomValue(),
                        getRandomColor());
            case 4:
                return new Square(getRandomValue(), getRandomColor());
            default:
                throw new IllegalStateException("Unexpected value: " + counter);
        }
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }

    private int getRandomValue() {
        return random.nextInt(MAX_UNIT_LIMIT) + MIN_UNIT_LIMIT;
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }
}
