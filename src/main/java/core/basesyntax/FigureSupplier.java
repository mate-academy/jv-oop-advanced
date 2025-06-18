package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int maxNumber = 5;
    private final int maxBound = 10;

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMaxBound() {
        return maxBound;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(getMaxNumber());
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(randomDouble(), color);
            case 1:
                return new Square(randomDouble(), color);
            case 2:
                return new Rectangle(randomDouble(), randomDouble(), color);
            case 3:
                return new RightTriangle(randomDouble(), randomDouble(), color);
            case 4:
                return new IsoscelesTrapezoid(randomDouble(), randomDouble(),
                        randomDouble(), color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10.0, "white");
    }

    private double randomDouble() {
        return random.nextInt(getMaxBound()) + 1;
    }
}
