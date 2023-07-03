package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int SIDE_LIMIT = 1000;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_TYPES_COUNT);

        switch (index) {
            case 0:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSide(), getRandomSide(), getRandomSide());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSide(), getRandomSide());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSide(), getRandomSide());
            case 3:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomSide());
            case 4:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    private double getRandomSide() {
        return random.nextInt(SIDE_LIMIT);
    }
}
