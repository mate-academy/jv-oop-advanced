package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_LENGTH = 25.0;
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int DEFAULT_RADIOS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_RADIOS);
    }

    private double getRandomUnits() {
        return MAX_LENGTH * random.nextDouble();
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(AMOUNT_OF_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (randomFigureIndex) {
            case 0:
                return new Circle(color, getRandomUnits());
            case 1:
                return new IsoscelesTrapezoid(color, getRandomUnits(),
                        getRandomUnits(), getRandomUnits());
            case 2:
                return new Rectangle(color, getRandomUnits(), getRandomUnits());
            case 3:
                return new RightTriangle(color, getRandomUnits(), getRandomUnits());
            case 4:
                return new Square(color, getRandomUnits());
            default:
                return getDefaultFigure();
        }
    }

}
