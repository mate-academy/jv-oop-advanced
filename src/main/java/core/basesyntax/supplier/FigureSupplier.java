package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int RADIUS = 10;
    private final int NUMBER = 8;
    private final int ENUMBER = 8;

    public Figure getRandomFigure() {
        switch (random.nextInt(ENUMBER) + 1) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(NUMBER) + 1);
            case 2:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(NUMBER) + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(NUMBER) + 1,
                        random.nextInt(NUMBER) + 1);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(NUMBER) + 1,
                        random.nextInt(NUMBER) + 1);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(NUMBER) + 1,
                        random.nextInt(NUMBER) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), RADIUS);
    }
}
