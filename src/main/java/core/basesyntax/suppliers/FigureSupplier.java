package core.basesyntax.suppliers;

import core.basesyntax.figures.*;
import core.basesyntax.templates.Figure;

import java.util.Random;

public abstract class FigureSupplier {

    public static Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 1:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(11));
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(), random.nextInt(11), random.nextInt(11));
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(), random.nextInt(11), random.nextInt(11));
            case 4:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(11));
            default:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), random.nextInt(11), random.nextInt(11), random.nextInt(11));
        }
    }

    public static Figure getDefaultFigure() {
        return new Square(ColorSupplier.getRandomColor(), 10);
    }
}
