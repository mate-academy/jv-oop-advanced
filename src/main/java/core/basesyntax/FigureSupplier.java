package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return new Square(
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor()
                );
            case 1:
                return new Rectangle(
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor()
                );
            case 2:
                return new RightTriangle(
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor()
                );
            case 3:
                return new IsoscelesTrapezoid(
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor()
                );
            case 4:
                return new Circle(
                        random.nextDouble() * 10,
                        colorSupplier.getRandomColor()
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}

