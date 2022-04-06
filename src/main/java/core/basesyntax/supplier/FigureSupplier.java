package core.basesyntax.supplier;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {


    public static Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(4) + 1) {
            case 1:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(9) + 1);
            case 2:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(9) + 1);
            case 3:
                return new Rectangle(ColorSupplier.getRandomColor(), random.nextInt(9) + 1,
                        random.nextInt(9) + 1);
            case 4:
                return new RightTriangle(ColorSupplier.getRandomColor(), random.nextInt(9) + 1,
                        random.nextInt(9) + 1);
            case 5:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), random.nextInt(9) + 1,
                        random.nextInt(9) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(ColorSupplier.getRandomColor(), 10);
    }
}
