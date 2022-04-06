package core.basesyntax.supplier;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(4) + 1) {
            case 1:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(8) + 1);
            case 2:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(8) + 1);
            case 3:
                return new Rectangle(ColorSupplier.getRandomColor(), random.nextInt(8) + 1,
                        random.nextInt(8) + 1);
            case 4:
                return new RightTriangle(ColorSupplier.getRandomColor(), random.nextInt(8) + 1,
                        random.nextInt(8) + 1);
            case 5:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), random.nextInt(8) + 1,
                        random.nextInt(8) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(ColorSupplier.getRandomColor(), 10);
    }
}
