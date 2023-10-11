package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_COUNT = 5;
    private static final int SIDE_CONSTANT = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private double getRandomSide() {
        return random.nextDouble() * SIDE_CONSTANT + 1;
    }

    public Figure getRandomFigure() {
        int choice = random.nextInt(FIGURES_COUNT);
        Color color = colorSupplier.getRandomColor();

        switch (choice) {
            case 0:
                return new Square(color, getRandomSide());
            case 1:
                return new Rectangle(color, getRandomSide(),
                        getRandomSide());
            case 2:
                return new RightTriangle(color, getRandomSide(),
                        getRandomSide());
            case 3:
                return new Circle(color, getRandomSide());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
