package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final int AMOUNT_OF_FIGURES = 4;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(AMOUNT_OF_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0:
                return new Circle(getRandomValue(), color);
            case 1:
                return new Rectangle(getRandomValue(), getRandomValue(), color);
            case 2:
                return new RightTriangle(getRandomValue(), color);
            case 3:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(),
                        getRandomValue(), getRandomValue(), color);
            default:
                return new Square(getRandomValue(), color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomValue() {
        return random.nextDouble(MAX_VALUE);
    }
}
