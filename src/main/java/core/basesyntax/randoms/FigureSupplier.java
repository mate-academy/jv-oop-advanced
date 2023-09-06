package core.basesyntax.randoms;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_SIZE)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
