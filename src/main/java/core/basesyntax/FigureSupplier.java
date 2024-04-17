package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_RANDOM_PARAMETR = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String figureColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(FIGURE_COUNT);

        switch (randomNumber) {
            case 0:
                return createCircle(figureColor);
            case 1:
                return createSquare(figureColor);
            case 2:
                return createRightTriangle(figureColor);
            case 3:
                return createRectangle(figureColor);
            case 4:
                return createIsoscelesTrapezoid(figureColor);
            default:
                return new Circle(10, Color.WHITE.name());
        }
    }

    public int randomSize () {
        return random.nextInt(FIGURE_RANDOM_PARAMETR);
    }

    private Circle createCircle(String color) {
        int radius = randomSize();
        return new Circle(radius,color);
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

    public Figure getDefaultFigure() {
        final int DEFAULT_RADIUS = 10;
        String defaultWhiteColor = Color.WHITE.name();
        return new Circle(DEFAULT_RADIUS, defaultWhiteColor);
    }
}
