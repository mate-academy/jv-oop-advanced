package main.java.core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_COUNTER = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        String[] figure = {"Circle", "IsoscelesTrapezoid", "Rectangle", "RightTriangle", "Square"};
        int i = random.nextInt(figure.length);
        switch (figure[i]) {
            case "Circle":
                return new Circle(ColorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_COUNTER) + 1);
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_COUNTER) + 1,
                        random.nextInt(RANDOM_COUNTER) + 12,
                        random.nextInt(RANDOM_COUNTER) + 1);
            case "Rectangle":
                return new Rectangle(ColorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_COUNTER) + 11,
                        random.nextInt(RANDOM_COUNTER) + 1);
            case "RightTriangle":
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_COUNTER) + 1,
                        random.nextInt(RANDOM_COUNTER) + 1);

            default:
                return new Square(ColorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_COUNTER) + 1);
        }
    }
}
