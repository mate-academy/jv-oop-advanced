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
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int maxSize = 5;
    private final int givenRadius = 10;

    public Figure getRandomFigure() {
        switch (random.nextInt(maxSize)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(maxSize));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxSize), random.nextInt(maxSize), random.nextInt(maxSize));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(maxSize),
                        random.nextInt(maxSize));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(maxSize));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(maxSize));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), givenRadius);
    }
}
