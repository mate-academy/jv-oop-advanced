package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_TYPES = 5;
    public static final int MAX_SIDES_LENGTH = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(FIGURE_TYPES);
        int side1 = random.nextInt(MAX_SIDES_LENGTH) + 1;
        int side2 = random.nextInt(MAX_SIDES_LENGTH) + 1;
        int side3 = random.nextInt(MAX_SIDES_LENGTH) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (choice) {
            case 0:
                return new Circle(side1, color);
            case 1:
                return new Square(side1, color);
            case 2:
                return new Rectangle(side1, side2, color);
            case 3:
                return new RightTriangle(side1, side2, color);
            default:
                return new IsoscelesTrapezoid(side1, side2, side3, color);
        }
    }

    public static Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(DEFAULT_RADIUS,
                DEFAULT_COLOR.name().toLowerCase());
        return defaultFigure;
    }
}
