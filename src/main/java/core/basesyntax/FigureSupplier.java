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
    private static Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_QUANTITY);
        switch (index) {
            case 0: {
                return new Circle(random.nextInt(MAX_VALUE));
            }
            case 1: {
                return new IsoscelesTrapezoid(random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            }
            case 2: {
                return new Rectangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            }
            case 3: {
                return new RightTriangle(random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            }
            case 4: {
                return new Square(random.nextInt(MAX_VALUE));
            }
            default: {
                return null;
            }
        }
    }
}
