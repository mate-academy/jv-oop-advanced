package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_TYPES = 5;
    private static final double MAX_SIDE_LENGTH = 100.0;
    private static final double MIN_SIDE_LENGTH = 1.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    private double getRandomSide() {
        return random.nextDouble() * MAX_SIDE_LENGTH + MIN_SIDE_LENGTH;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(MAX_FIGURE_TYPES);
        switch (figureType) {
            case 0:
                return new Square(color, getRandomSide());
            case 1:
                return new Rectangle(color, getRandomSide(), getRandomSide());
            case 2:
                return new RightTriangle(color, getRandomSide(), getRandomSide());
            case 3:
                return new Circle(color, getRandomSide());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomSide(),
                        getRandomSide(), getRandomSide());
            default:
                return getDefaultFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.name(), DEFAULT_RADIUS);
    }
}
