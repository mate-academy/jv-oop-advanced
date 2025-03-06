package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        Random random = new Random();
        int shapeType = random.nextInt(5);

        switch (shapeType) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(),
                        random.nextDouble());
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
            case 2:
                return new RightTriangle(random.nextDouble(),
                        random.nextDouble(), ColorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble(),
                        ColorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble(), random.nextDouble());
            default:
                return null;
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "White");

    }
}
