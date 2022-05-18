package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int MAX_RANDOM_NUMBER = 100;
    private final int MAX_FIGURE_NUMBER = 5;
    private Random random;
    private ColorSupplier colorSupplier;

    public int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    public Figure getRandomFigure() {
    }

    public String getRandomCircle() {
        return getRandomNumber() + colorSupplier.getRandomColor();
    }

    public String getRandomIsoscelesTrapezoid() {
        return getRandomNumber() + getRandomNumber() + getRandomNumber() + colorSupplier.getRandomColor();
    }

    public String getRandomRectangle() {
        return getRandomNumber() + getRandomNumber() + colorSupplier.getRandomColor();
    }

    public String getRandomRightTriangle() {
        return getRandomNumber() + getRandomNumber() + colorSupplier.getRandomColor();
    }

    public String getRandomSquare() {
        return getRandomNumber() + colorSupplier.getRandomColor();
    }



}
