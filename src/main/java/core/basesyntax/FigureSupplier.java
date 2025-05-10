package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureType) {
            case 0:
                return new Circle(color, getRandomValue());
            case 1:
                return new Square(color, getRandomValue());
            case 2:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomValue() {
        return random.nextDouble() * 10;
    }
}
