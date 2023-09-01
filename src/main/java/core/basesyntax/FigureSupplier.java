package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES = 5;
    private static final double MAX_VALUE = 40.0;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private String randomColor = new ColorSupplier().getRandomColor();


    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURES);
        switch (randomFigureIndex) {
            case 0: return createCircle();
            case 1: return createIsoscelesTrapezoid();
            case 2: return createRectangle();
            case 3: return createRightTriangle();
            case 4: return createSquare();
            default: return getDefaultFigure();
        }
    }

    private double getRandomUnits() {
        return random.nextDouble() * MAX_VALUE;
    }

    private Circle createCircle() {
        double randomRadius = getRandomUnits();
        return new Circle(randomColor, randomRadius);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        double randomLowBase = getRandomUnits();
        double randomUpperBase = getRandomUnits();
        double randomSidePart = getRandomUnits();
        return new IsoscelesTrapezoid(randomColor, randomLowBase, randomUpperBase, randomSidePart);
    }

    private Rectangle createRectangle() {
        double randomFirstSide = getRandomUnits();
        double randomSecondSide = getRandomUnits();
        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private RightTriangle createRightTriangle() {
        double randomFirstLeg = getRandomUnits();
        double randomSecondLeg = getRandomUnits();
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Square createSquare() {
        double randomSide = getRandomUnits();
        return new Square(randomColor, randomSide);
    }
}
