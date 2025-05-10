package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int getRandomIndex = new Random().nextInt(5);
        ColorSupplier supplier = new ColorSupplier();
        switch (getRandomIndex) {
            case 1:
                return new Circle(supplier.getRandomColor(), 3);
            case 2:
                return new Rectangle(supplier.getRandomColor(), 5,5);
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        2,
                        3,
                        4);
            case 4:
                return new Square(supplier.getRandomColor(), 4);
            default:
                return new RightTriangle(supplier.getRandomColor(), 4, 5);
        }
    }
}
