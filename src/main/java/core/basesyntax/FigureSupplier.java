package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return new Square(random.nextDouble() * 10,
                        colorSupplier.getRendomColor());
            case 1:
                return new Rectangle(random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRendomColor());
            case 2:
                return new RightTriangle(random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRendomColor());
            case 3:
                return new Circle(random.nextDouble() * 10,
                        colorSupplier.getRendomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        random.nextDouble() * 10,
                        colorSupplier.getRendomColor());
            default:
                throw new IllegalArgumentException("this figure not exist");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
