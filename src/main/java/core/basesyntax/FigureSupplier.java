package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random rand = new Random();
        ColorSupplier supplier = new ColorSupplier();

        return switch (rand.nextInt(4) + 1) {
            case 1 -> new Circle(supplier.getRandomColor(),
                    rand.nextInt(9) + 1);
            case 2 -> new IsoscelesTrapezoid(supplier.getRandomColor(),
                    rand.nextInt(9) + 1,
                    rand.nextInt(9) + 1,
                    rand.nextInt(9) + 1);
            case 3 -> new RightTriangle(supplier.getRandomColor(),
                    rand.nextInt(9) + 1,
                    rand.nextInt(9) + 1);
            case 4 -> new Rectangle(supplier.getRandomColor(),
                    rand.nextInt(9) + 1,
                    rand.nextInt(9) + 1);
            default -> new Square(supplier.getRandomColor(),
                    rand.nextInt(9) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
