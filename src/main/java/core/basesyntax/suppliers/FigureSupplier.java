package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_OF_FIGURES = 4;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIZE_OF_SIDE = 50;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        switch (random.nextInt(COUNT_OF_FIGURES)) {
            case 0:
                return new Square(random.nextInt(MAX_SIZE_OF_SIDE), colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(random.nextInt(MAX_SIZE_OF_SIDE),
                        random.nextInt(MAX_SIZE_OF_SIDE),
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(MAX_SIZE_OF_SIDE),
                        random.nextInt(MAX_SIZE_OF_SIDE),
                        colorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE_OF_SIDE),
                        random.nextInt(MAX_SIZE_OF_SIDE),
                        random.nextInt(MAX_SIZE_OF_SIDE),
                        colorSupplier.getRandomColor());
            default:
                return new Circle(random.nextInt(MAX_SIZE_OF_SIDE),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString().toLowerCase());
    }
}
