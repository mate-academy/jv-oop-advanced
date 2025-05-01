package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}