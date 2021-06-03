package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private int upperBound;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier, int upperBound) {
        this.colorSupplier = colorSupplier;
        this.upperBound = upperBound;
    }

    public Figure getRandomFigure() {
        switch (getRandomNumber(FIGURE_COUNT)) {
            case 0:
                return new Square(getRandomNumber(upperBound),
                        colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(getRandomNumber(upperBound),
                        getRandomNumber(upperBound),
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(getRandomNumber(upperBound),
                        getRandomNumber(upperBound),
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomNumber(upperBound),
                        getRandomNumber(upperBound),
                        getRandomNumber(upperBound),
                        getRandomNumber(upperBound),
                        colorSupplier.getRandomColor());
        }
    }

    private int getRandomNumber(int bound) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(bound);
    }

}
