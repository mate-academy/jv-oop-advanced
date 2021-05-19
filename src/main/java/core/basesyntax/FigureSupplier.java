package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier supplier = new ColorSupplier();

    private final Random generator = new Random();

    public ColorSupplier getSupplier() {
        return supplier;
    }

    public Random getGenerator() {
        return generator;
    }

    public Figure getRandomFigure() {
        String color = getSupplier().getRandomColor();
        int choice = (int)(Math.random() * 5 + 1);
        switch (choice) {
            case 1:
                return new Circle(color, getGenerator().nextInt(10) + 1);
            case 2:
                return new Square(color, getGenerator().nextInt(10) + 1);
            case 3:
                return new Rectangle(color, getGenerator().nextInt(10)
                        + 1,getGenerator().nextInt(10) + 1);
            case 4:
                return new RightTriangle(color, getGenerator().nextInt(10)
                        + 1,getGenerator().nextInt(10) + 1);
            case 5:
                return new IsoscelesTrapezoid(color, getGenerator().nextInt(10)
                        + 1,getGenerator().nextInt(10) + 1,getGenerator().nextInt(10) + 1);
            default:
                return null;
        }
    }
}
