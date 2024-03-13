package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        int choice = random.nextInt(5);
        switch (choice) {
            case 0:
                return new Square(ColorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(ColorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                return null;
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
