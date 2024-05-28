package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(5);
        String color = colorSupplier.getRandomColor();
        return switch (figureType) {
            case 0 -> new Square(color, getRandomSize());
            case 1 -> new Rectangle(color, getRandomSize(), getRandomSize());
            case 2 -> new RightTriangle(color, getRandomSize(), getRandomSize());
            case 3 -> new Circle(color, getRandomSize());
            case 4 -> new IsoscelesTrapezoid(color, getRandomSize(),
                    getRandomSize(), getRandomSize());
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("red", 3);
    }

    private double getRandomSize() {
        Random r = new Random();
        return r.nextInt(50);
    }
}


