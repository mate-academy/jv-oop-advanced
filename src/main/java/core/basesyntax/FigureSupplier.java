package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    static Figure getFigure() {
        Random random = new Random();
        int figure = random.nextInt(4);
        int size = 100;
        switch (figure) {
            case 0:
                return new Circle(ColorSupplier.getColor(), random.nextInt(size));
            case 1:
                return new Rectangle(ColorSupplier.getColor(), random.nextInt(size), random.nextInt(size));
            case 2:
                return new IsoscelesTrapezoid(ColorSupplier.getColor(), random.nextInt(size), random.nextInt(size), random.nextInt(size));
            case 3:
                return new RightTriangle(ColorSupplier.getColor(), random.nextInt(size));
            default:
                return new Square(ColorSupplier.getColor(), random.nextInt(size)); }
}
}
