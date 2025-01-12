package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final double defaultSize = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int randomSize = random.nextInt(10);

    public int getRandomSize() {
        return randomSize;
    }

    public Figure getRandomFigure(int index) {
        String randomColor = colorSupplier.getRandomColor();
        switch (index) {
            case 0: return new Square(randomColor, getRandomSize());
            case 1: return new Rectangle(randomColor, getRandomSize(), getRandomSize());
            default: return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
        }
    }

    public Figure getDefaultFigure(int index) {
        switch (index) {
            case 4 : return new Circle("WHITE", defaultSize);
            default : return new IsoscelesTrapezoid("BLUE", defaultSize,
                    defaultSize, defaultSize);

        }
    }
}

