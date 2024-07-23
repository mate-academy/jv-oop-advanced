package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 10;
    private static final int FIGURE_TYPES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_TYPES)) {
            case 0:
                return new Square(color, getRandomSide());
            case 1:
                return new Rectangle(color, getRandomSide(), getRandomSide());
            case 2:
                return new RightTriangle(color, getRandomSide(), getRandomSide());
            case 3:
                return new Circle(color, getRandomSide());
            case 4:
                return new IsoscelesTrapezoid(color,
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomSide() {
        return random.nextDouble() * MAX_SIDE_LENGTH;
    }
}
