package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_LENGTH = 25.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, colorSupplier.getDefaultColor());
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (randomFigureIndex) {
            case 0: return new Circle(getRandomUnits(), color);
            case 1: return new IsoscelesTrapezoid(getRandomUnits(), getRandomUnits(), color);
            case 2: return new Rectangle(getRandomUnits(), getRandomUnits(), color);
            case 3: return new RightTriangle(getRandomUnits(), color);
            case 4: return new Square(getRandomUnits(), color);
            default: return getDefaultFigure();
        }
    }

    private double getRandomUnits() {
        return MAX_LENGTH * random.nextDouble();
    }
}
