package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        switch (random.nextInt(6)) {
            case 1:
                return new Circle(ColorSupplier.getRandomColor(), random.nextInt(1000) * Math.random());
            case 2:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextInt(1000) * Math.random(),
                        random.nextInt(1000) * Math.random(),
                        random.nextInt(1000) * Math.random());
            case 3:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextInt(1000) * Math.random(),
                        random.nextInt(1000) * Math.random());
            case 4:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextInt(1000) * Math.random(),
                        random.nextInt(1000) * Math.random());
            case 5:
                return new Square(ColorSupplier.getRandomColor(),
                        random.nextInt(1000) * Math.random());
            default:
                return getRandomFigure();
        }
    }
}
