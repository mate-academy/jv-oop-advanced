package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int value = random.nextInt(10) + 1;

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Circle(value, colorSupplier.getRandomColor());
            case 1:
                return new Square(value, colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(value, value, colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(value, value, colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(value, value, value,
                        colorSupplier.getRandomColor());
            default:
                return new Circle(value, colorSupplier.getRandomColor());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
