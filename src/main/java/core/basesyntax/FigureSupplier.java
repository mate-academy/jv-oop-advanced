package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int DIMENSION_LIMIT = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (figureNumber) {

            case 0: {
                return new Square(getDimensionLimit(), randomColor);
            }
            case 1: {
                return new Rectangle(getDimensionLimit(), getDimensionLimit(), randomColor);
            }
            case 2: {
                return new Circle(getDimensionLimit(), randomColor);
            }
            case 3: {
                return new RightTriangle(getDimensionLimit(), getDimensionLimit(), randomColor);
            }
            default: {
                return new IsoscelesTrapezoid(getDimensionLimit(), getDimensionLimit(),
                        getDimensionLimit(), randomColor);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

    private int getDimensionLimit() {
        return random.nextInt(DIMENSION_LIMIT);
    }
}
