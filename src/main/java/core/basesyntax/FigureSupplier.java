package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        Random random = new Random();
        int ten = 10;

        switch (random.nextInt(5)) {
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(), random.nextInt(ten),
                           random.nextInt(ten));
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(), random.nextInt(ten),
                           random.nextInt(ten));
            case 3:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(ten));
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), random.nextInt(ten),
                           random.nextInt(ten), random.nextInt(ten));
            default:
                return new Square(ColorSupplier.getRandomColor(), random.nextInt(ten));
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
