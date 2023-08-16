package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES = 5;
    private static final double DEFAULT_LENGTH = 40.0;
    private static final int DEFAULT_RADIUS = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (randomFigureIndex) {
            case 0: return new Circle(color, getRandomUnits());
            case 1: return new IsoscelesTrapezoid(color, getRandomUnits(),
                    getRandomUnits(), getRandomUnits());
            case 2: return new Rectangle(color, getRandomUnits(), getRandomUnits());
            case 3: return new RightTriangle(color, getRandomUnits(), getRandomUnits());
            case 4: return new Square(color, getRandomUnits());
            default: return getDefaultFigure();
        }
    }

    private double getRandomUnits() {
        return random.nextDouble() * DEFAULT_LENGTH;
    }
}
