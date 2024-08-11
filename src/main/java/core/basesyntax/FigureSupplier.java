package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 127;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(NUMBER_OF_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigureIndex) {
            case 0:
                return new IsoscelesTrapezoid(getRandomNum(), getRandomNum(),
                        getRandomNum(), randomColor);
            case 1:
                return new Circle(getRandomNum(), randomColor);
            case 2:
                return new RightTriangle(getRandomNum(), getRandomNum(), randomColor);
            case 3:
                return new Square(getRandomNum(), randomColor);
            default:
                return new Rectangle(getRandomNum(), getRandomNum(), randomColor);
        }
    }

    private int getRandomNum() {
        return random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
    }
}
