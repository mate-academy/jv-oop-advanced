package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.template.Figure;
import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(5)) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            case 4:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
