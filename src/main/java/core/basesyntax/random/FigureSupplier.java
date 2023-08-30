package core.basesyntax.random;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.figures.*;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomNumber) {
            case 0:
                return new Circle(supplier.getRandomColor(), random.nextInt());
            case 1:
                return new IsoscelesTrapezoid(supplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
            case 2:
                return new Rectangle(supplier.getRandomColor(), random.nextDouble(), random.nextDouble());
            case 3:
                return new RightTriangle(supplier.getRandomColor(), random.nextDouble(), random.nextDouble());
            default:
                return new Square(supplier.getRandomColor(), random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(supplier.getDefaultColor(), DEFAULT_RADIUS);
    }
}
