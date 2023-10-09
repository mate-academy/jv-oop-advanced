package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(5);
        String color = new ColorSupplier().getRandomColor();

        switch (choice) {
            case 0:
                return new Square(color, random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(color, random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
