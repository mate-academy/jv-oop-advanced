package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        int choice = random.nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        switch (choice) {
            case 0:
                return new Square(random.nextInt(10) + 1, randomColor);
            case 1:
                return new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 1, randomColor);
            case 2:
                return new RightTriangle(random.nextInt(10) + 1,
                        random.nextInt(10) + 1, randomColor);
            case 3:
                return new Circle(random.nextInt(10) + 1, randomColor);
            default:
                return new IsoscelesTrapezoid(random.nextInt(10) + 1,
                        random.nextInt(10) + 1, random.nextInt(10) + 1, randomColor);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(10, "white"); // Default figure is white circle with radius 10
    }
}
