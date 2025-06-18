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
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 10;
    private static final int BOUND_RANDOM = 5;
    private static final int SIZE_FOR_DEFAULT_fIGURE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureType = random.nextInt(BOUND_RANDOM);

        String randomColor = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(randomColor, getRandomSize());
            case 1:
                return new Square(randomColor, getRandomSize());
            case 2:
                return new Rectangle(randomColor, getRandomSize(), getRandomSize());
            case 3:
                return new IsoscelesTrapezoid(randomColor, getRandomSize(),
                                         getRandomSize(), getRandomSize());
            case 4:
                return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), SIZE_FOR_DEFAULT_fIGURE);
    }

    private double getRandomSize() {
        return MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();
    }
}
