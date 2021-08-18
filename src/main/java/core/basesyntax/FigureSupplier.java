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
        Colors randomColor = colorSupplier.getRandomColor();
        int firstRandomNum = random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
        int secondRandomNum = random.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE
                + random.nextInt(MAX_VALUE);
        int thirdRandomNum = firstRandomNum + secondRandomNum;

        switch (randomFigureIndex) {
            case 0:
                return new IsoscelesTrapezoid(firstRandomNum, secondRandomNum,
                        thirdRandomNum, randomColor);
            case 1:
                return new Circle(firstRandomNum, randomColor);
            case 2:
                return new RightTriangle(firstRandomNum, secondRandomNum, randomColor);
            case 3:
                return new Square(firstRandomNum, randomColor);
            default:
                return new Rectangle(firstRandomNum, secondRandomNum, randomColor);
        }
    }
}
