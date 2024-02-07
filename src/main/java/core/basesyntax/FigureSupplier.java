package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS = 10;
    private static final int MAX_VALUE = 100;
    private static final int FIGURES_QUANTITY = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, colorSupplier.getDefaultColor());
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_QUANTITY);
        switch (index) {
            case 0: {
                return new Circle(random.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            }
            case 1: {
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            }
            case 2: {
                return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            }
            case 3: {
                return new RightTriangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            }
            default: {
                return new Square(random.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            }
        }
    }
}
