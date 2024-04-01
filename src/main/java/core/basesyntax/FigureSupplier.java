package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int MAX_SIDES_LENGTH = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int choice = random.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();

        switch (choice) {
            case 0:
                return new Circle(getRandomLength(), color);
            case 1:
                return new Square(getRandomLength(), color);
            case 2:
                return new Rectangle(getRandomLength(), getRandomLength(), color);
            case 3:
                return new RightTriangle(getRandomLength(), getRandomLength(), color);
            default:
                return new IsoscelesTrapezoid(
                        getRandomLength(), getRandomLength(), getRandomLength(), color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name().toLowerCase());
    }

    private int getRandomLength() {
        return random.nextInt(MAX_SIDES_LENGTH) + 1;
    }
}
