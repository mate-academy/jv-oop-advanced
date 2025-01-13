package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_SIZE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int getRandomSize() {
        return random.nextInt(10);
    }

    public Figure getRandomFigure(int index) {
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0: return new Square(randomColor, getRandomSize());
            case 1: return new Rectangle(randomColor, getRandomSize(), getRandomSize());
            case 2: return new IsoscelesTrapezoid("BLUE", getRandomSize(),
                    getRandomSize(), getRandomSize());
            default: return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", DEFAULT_SIZE);
    }
}

