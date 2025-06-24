package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public AreaCalculable getRandomFigure() {
        int figureType = ThreadLocalRandom.current().nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, randomValue());
            case 1:
                return new Square(color, randomValue());
            case 2:
                return new Rectangle(color, randomValue(), randomValue());
            case 3:
                return new RightTriangle(color, randomValue(), randomValue());
            case 4:
                return new IsoscelesTrapezoid(color, randomValue(), randomValue(), randomValue());
            default:
                return getDefaultFigure();
        }
    }

    public AreaCalculable getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double randomValue() {
        return ThreadLocalRandom.current().nextDouble(1, 10);
    }
}
