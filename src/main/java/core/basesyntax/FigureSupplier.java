package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_TYPES = 5;
    public static final int MAX_SIDES_LENGTH = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
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

    private int getRandomLength() {
        return random.nextInt(MAX_SIDES_LENGTH) + 1;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS,
                DEFAULT_COLOR.name().toLowerCase());
        return defaultFigure;
    }
}
