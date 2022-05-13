package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    //private final Random random = new Random();
    //private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        //The other half of figures should have the same, default parameters.
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(random.nextInt(10), supplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(10), random.nextInt(10), random.nextInt(10), supplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(10), random.nextInt(10),
                        supplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(10), random.nextInt(10),
                        supplier.getRandomColor());
            case 4:
                return new Square(random.nextInt(10), supplier.getRandomColor());
            default:
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }

}

