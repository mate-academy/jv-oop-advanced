package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_OF_UNITS_NUMBER = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);
        switch (randomFigure) {
            case 1: return getRandomCircle();
            case 2: return getRandomSquare();
            case 3: return getRandomTriangle();
            case 4: return getRandomRectangle();
            default: return getRandomTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),10);
    }

    public Circle getRandomCircle() {
        String randomColor = supplier.getRandomColor();
        int randomRadius = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    public Square getRandomSquare() {
        String randomColor = supplier.getRandomColor();
        int randomSide = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        return new Square(randomColor, randomSide);
    }

    public RightTriangle getRandomTriangle() {
        String randomColor = supplier.getRandomColor();
        int randomFirstLeg = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        int randomSecondLeg = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    public Rectangle getRandomRectangle() {
        String randomColor = supplier.getRandomColor();
        int randomLength = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        int randomWidth = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        return new Rectangle(randomColor, randomLength, randomWidth);
    }

    public IsoscelesTrapezoid getRandomTrapezoid() {
        String randomColor = supplier.getRandomColor();
        int randomFirstUnits = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        int randomSecondUnits = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        int randomHeight = random.nextInt(MAX_VALUE_OF_UNITS_NUMBER);
        /*
        for a standardized view, the trapezoid should have
        the first (top) parallel side smaller than the second (bottom)
        */
        if (randomFirstUnits < randomFirstUnits) {
            return new IsoscelesTrapezoid(randomColor,
                    randomFirstUnits, randomSecondUnits, randomHeight);
        } else if (randomFirstUnits > randomSecondUnits) {
            return new IsoscelesTrapezoid(randomColor,
                    randomSecondUnits, randomFirstUnits, randomHeight);
        } else {
            randomSecondUnits += 10;
            return new IsoscelesTrapezoid(randomColor,
                    randomFirstUnits, randomSecondUnits, randomHeight);
        }
    }
}
