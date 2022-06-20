package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int index = random.nextInt(5);
        if (index == 1) {
            return new Circle(supplier.getRandomColor(), random.nextInt(100));
        }
        if (index == 2) {
            return new IsoscelesTrapezoid(supplier.getRandomColor(),
                    random.nextInt(100), random.nextInt(100), random.nextInt(100));
        }
        if (index == 3) {
            return new Rectangle(supplier.getRandomColor(),
                    random.nextInt(100), random.nextInt(100));
        }
        if (index == 4) {
            return new RightTriangle(supplier.getRandomColor(), random.nextInt(100));
        }
        return new Square(supplier.getRandomColor(), random.nextInt(100));
    }
}
