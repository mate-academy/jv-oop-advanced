package core.basesyntax.figsupply;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.colosuply.Color;
import core.basesyntax.colosuply.ColorSupplier;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;
import static core.basesyntax.figsupply.FigureType.values;

public class FigureSupplier {
    static final int RANDOM_LENGTH_MAX = 10;
    static final int RANDOM_LENGTH_MIN = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(values().length);
        FigureType figureType = values()[indexFigure];

        switch (figureType) {
            case CIRCLE:
                return new Circle(getRandomLength(),
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(getRandomLength(),
                        getRandomLength(),
                        getRandomLength(),
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(getRandomLength(),
                        getRandomLength(),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(getRandomLength(),
                        getRandomLength(),
                        colorSupplier.getRandomColor());
            case SQUARE:
            default:
                return new Square(getRandomLength(),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RANDOM_LENGTH_MAX, Color.WHITE);
    }

    private int getRandomLength() {
        return random.nextInt(RANDOM_LENGTH_MAX - RANDOM_LENGTH_MIN) + RANDOM_LENGTH_MIN;
    }
}
