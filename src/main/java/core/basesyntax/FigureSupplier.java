package core.basesyntax;

import core.basesyntax.figures.*;
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
