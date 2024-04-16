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

    private Circle createCircle(String color) {
        int radius = FIGURE_RANDOM_PARAMETR;
        return new Circle(radius,color);

    }

    private Square createSquare(String color) {
        int side = FIGURE_RANDOM_PARAMETR;
        return new Square(side, color);
    }

    private RightTriangle createRightTriangle(String color) {
        int firstLeg = FIGURE_RANDOM_PARAMETR;
        int secondLeg = FIGURE_RANDOM_PARAMETR;
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Rectangle createRectangle(String color) {
        int firstSide = FIGURE_RANDOM_PARAMETR;
        int secondSide = FIGURE_RANDOM_PARAMETR;
        return new Rectangle(firstSide, secondSide, color);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        int firstDistance = FIGURE_RANDOM_PARAMETR;
        int secondDistance = FIGURE_RANDOM_PARAMETR;
        int height = FIGURE_RANDOM_PARAMETR;
        return new IsoscelesTrapezoid(firstDistance, secondDistance, height, color);
    }

    public Figure getDefaultFigure() {
        int deFaultRadius = 10;
        String defaultWhiteColor = Color.WHITE.name();
        return new Circle(deFaultRadius, defaultWhiteColor);
    }
}
