package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int boundRandomFigureNumber = 5;
    private static final int boundRandomSide = 10;
    private static final double defaultRadius = 10;
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DefaultFigure.defaultFigure.toString(),
                DefaultFigure.WHITE.toString(),
                defaultRadius);
    }

    public Figure getRandomFigure() {
        int randomNumber = getRandomFigureNumber();
        if (randomNumber == 0) {
            return new Circle("RandomCircle",
                    ColorSupplier.getRandomColor(),
                    getRandomSide());
        } else if (randomNumber == 1) {
            return new Square("RandomSquare",
                    ColorSupplier.getRandomColor(),
                    getRandomSide());
        } else if (randomNumber == 2) {
            return new Rectangle("RandomRectangle",
                    ColorSupplier.getRandomColor(),
                    getRandomSide(),
                    getRandomSide());
        } else if (randomNumber == 3) {
            return new IsoscelesTrapezoid("RandomIsoscelesTrapezoid",
                    ColorSupplier.getRandomColor(),
                    getRandomSide(),
                    getRandomSide(),
                    getRandomSide());
        } else {
            return new RightTriangle("RandomRightTriangle",
                    ColorSupplier.getRandomColor(),
                    getRandomSide(),
                    getRandomSide());
        }
    }

    private int getRandomFigureNumber() {
        int randomNumber = random.nextInt(boundRandomFigureNumber);
        return randomNumber;
    }

    private double getRandomSide() {
        double randomSide = random.nextInt(boundRandomSide) + 1;
        return randomSide;
    }
}
