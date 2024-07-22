package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int MAX_SIDE_LENGTH = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor().name();
        switch (random.nextInt(FIGURE_TYPES)) {
            case 0:
                return new Square(color, getRandomSide());
            case 1:
                return new Rectangle(color, getRandomSide(), getRandomSide());
            case 2:
                return new RightTriangle(color, getRandomSide(), getRandomSide());
            case 3:
                return new Circle(color, getRandomRadius());
            case 4:
                return new IsoscelesTrapezoid(color,
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    private double getRandomSide() {
        return random.nextDouble() * MAX_SIDE_LENGTH;
    }

    private double getRandomRadius() {
        return random.nextDouble() * MAX_SIDE_LENGTH;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10.0);
    }
}
