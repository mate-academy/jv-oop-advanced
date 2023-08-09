package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final double MAX_UNITS = 35;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Circle(randomColor, getRandomUnits());
            case 1:
                return new IsoscelesTrapezoid(
                        randomColor, getRandomUnits(), getRandomUnits(), getRandomUnits());
            case 2:
                return new Rectangle(randomColor, getRandomUnits(), getRandomUnits());
            case 3:
                return new RightTriangle(randomColor, getRandomUnits(), getRandomUnits());
            case 4:
                return new Square(randomColor, getRandomUnits());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

    public double getRandomUnits() {
        return random.nextDouble(MAX_UNITS);
    }
}
