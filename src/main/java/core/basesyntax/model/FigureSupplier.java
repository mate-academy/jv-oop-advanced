package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIDE_SIZE = 50.0;
    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure randomFigure;
        String randomColor = colorSupplier.getRandomColor();
        int codeOfRandomFigure = randomizer.nextInt(5);
        switch (codeOfRandomFigure) {
            case 0: {
                double randomSide = getRandomNumber();
                randomFigure = new Square(randomSide, randomColor);
                break;
            }
            case 1: {
                double randomHeight = getRandomNumber();
                double randomWidth = getRandomNumber();
                randomFigure = new Rectangle(randomHeight, randomWidth, randomColor);
                break;
            }
            case 2: {
                double randomFirstLeg = getRandomNumber();
                double randomSecondLeg = getRandomNumber();
                randomFigure = new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
                break;
            }
            case 3: {
                double randomRadius = getRandomNumber();
                randomFigure = new Circle(randomRadius, randomColor);
                break;
            }
            case 4: {
                double randomTopBase = getRandomNumber();
                double randomBottomBase = getRandomNumber();
                double randomHeight = getRandomNumber();
                randomFigure = new IsoscelesTrapezoid(randomTopBase,
                                                      randomBottomBase,
                                                      randomHeight,
                                                      randomColor);
                break;
            }
            default: {
                randomFigure = getDefaultFigure();
            }
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Circle(10.0, colorSupplier.getRandomColor());
    }

    private double getRandomNumber() {
        double randomNumber = randomizer.nextDouble() * MAX_SIDE_SIZE;
        return Math.round(randomNumber * 100.0) / 100.0;
    }
}
