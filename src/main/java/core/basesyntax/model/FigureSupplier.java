package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final double MAX_SIDE_SIZE = 50.0;
    private static final double DEFAULT_RADIUS_OF_CIRCLE = 10.0;

    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure randomFigure;
        Color randomColor = colorSupplier.getRandomColor();
        int codeOfRandomFigure = randomizer.nextInt(NUMBER_OF_FIGURES);
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
        return new Circle(DEFAULT_RADIUS_OF_CIRCLE, colorSupplier.getRandomColor());
    }

    private double getRandomNumber() {
        return randomizer.nextDouble() * MAX_SIDE_SIZE;
    }
}
