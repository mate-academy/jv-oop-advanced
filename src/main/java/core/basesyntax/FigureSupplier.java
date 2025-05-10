package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_RANDOM_PARAMETR = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(FIGURE_COUNT);

        return switch (randomNumber) {
            case 0 -> createCircle(figureColor);
            case 1 -> createSquare(figureColor);
            case 2 -> createRightTriangle(figureColor);
            case 3 -> createRectangle(figureColor);
            default -> createIsoscelesTrapezoid(figureColor);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int randomSize() {
        return random.nextInt(FIGURE_RANDOM_PARAMETR);
    }

    private Circle createCircle(String color) {
        int radius = randomSize();
        return new Circle(radius, color);
    }

    private Square createSquare(String color) {
        int side = randomSize();
        return new Square(side, color);
    }

    private RightTriangle createRightTriangle(String color) {
        int firstLeg = randomSize();
        int secondLeg = randomSize();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Rectangle createRectangle(String color) {
        int firstSide = randomSize();
        int secondSide = randomSize();
        return new Rectangle(firstSide, secondSide, color);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        int firstDistance = randomSize();
        int secondDistance = randomSize();
        int height = randomSize();
        return new IsoscelesTrapezoid(firstDistance, secondDistance, height, color);
    }
}
