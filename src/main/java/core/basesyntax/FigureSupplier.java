package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "white";
    public static final double MAX_SIDE_LENGTH = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        return switch (randomFigure) {
            case 0 -> createRandomSquare(color);
            case 1 -> createRandomRectangle(color);
            case 2 -> createRandomRightTriangle(color);
            case 4 -> createRandomIsoscelesTrapezoid(color);
            default -> createRandomCircle(color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square createRandomSquare(String color) {
        double side = getRandomSide();
        return new Square(color, (int) side);
    }

    private Rectangle createRandomRectangle(String color) {
        double width = getRandomSide();
        double height = getRandomSide();
        return new Rectangle(color, (int) width, (int) height);
    }

    private RightTriangle createRandomRightTriangle(String color) {
        double base = getRandomSide();
        double height = getRandomSide();
        return new RightTriangle(color, (int) base, (int) height);
    }

    private Circle createRandomCircle(String color) {
        double radius = getRandomSide();
        return new Circle(color, (int) radius);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(String color) {
        double base1 = getRandomSide();
        double base2 = getRandomSide();
        double height = getRandomSide();
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }

    private double getRandomSide() {
        return random.nextDouble() * MAX_SIDE_LENGTH;
    }
}
