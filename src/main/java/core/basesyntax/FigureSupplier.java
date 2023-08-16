package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES = 5;
    private static final double MAX_VALUE = 40.0;
    private static final int DEFAULT_RADIUS = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURES);
        double randomRadius = getRandomUnits();
        double randomSide = getRandomUnits();
        double randomFirstSide = getRandomUnits();
        double randomSecondSide = getRandomUnits();
        double randomFirstLeg = getRandomUnits();
        double randomSecondLeg = getRandomUnits();
        double randomUpperBase = getRandomUnits();
        double randomLowBase = getRandomUnits();
        double randomSidePart = getRandomUnits();
        String color = colorSupplier.getRandomColor();

        switch (randomFigureIndex) {
            case 0: return new Circle(color, randomRadius);
            case 1: return new IsoscelesTrapezoid(color, randomLowBase,
                    randomUpperBase, randomSidePart);
            case 2: return new Rectangle(color, randomFirstSide, randomSecondSide);
            case 3: return new RightTriangle(color, randomFirstLeg, randomSecondLeg);
            case 4: return new Square(color, randomSide);
            default: return getDefaultFigure();
        }
    }

    private double getRandomUnits() {
        return random.nextDouble() * MAX_VALUE;
    }
}
