package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(5);
        switch (choice) {
            case 0:
                return new Square(random.nextDouble() * 10, getRandomColor());
            case 1:
                return new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10, getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble() * 10, random.nextDouble() * 10, getRandomColor());
            case 3:
                return new Circle(random.nextDouble() * 10, getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10, random.nextDouble() * 10,
                        random.nextDouble() * 10, getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefolteFigure() {
        return new Circle(10, "white");
    }

    private String getRandomColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }
}
