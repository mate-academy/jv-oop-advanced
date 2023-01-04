package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import core.basesyntax.templates.Figure;
import java.util.Random;

public abstract class FigureSupplier {

    public static Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 1:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 4:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(10) + 1);
            default:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
