package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_RANDOM_PARAMETR = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String colorFigure = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_COUNT);

        switch (randomNumber) {
            case 0:
                return createCircle();
            case 1:
                return createSquare();
            case 2:
                return createRightTriangle();
            case 3:
                return createRectangle();
            case 4:
                return createIsoscelesTrapezoid();
            default:
                return new Circle(10, "white");

        }
    }

    private Circle createCircle() {
        int radius = FIGURE_RANDOM_PARAMETR;
        return new Circle(radius,colorFigure);

    }

    private Square createSquare() {
        int side = FIGURE_RANDOM_PARAMETR;
        return new Square(side, colorFigure);
    }

    private RightTriangle createRightTriangle() {
        int firstLeg = FIGURE_RANDOM_PARAMETR;
        int secondLeg = FIGURE_RANDOM_PARAMETR;
        return new RightTriangle(firstLeg, secondLeg, colorFigure);
    }

    private Rectangle createRectangle() {
        int firstSide = FIGURE_RANDOM_PARAMETR;
        int secondSide = FIGURE_RANDOM_PARAMETR;
        return new Rectangle(firstSide, secondSide, colorFigure);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        int firstDistance = FIGURE_RANDOM_PARAMETR;
        int secondDistance = FIGURE_RANDOM_PARAMETR;
        int height = FIGURE_RANDOM_PARAMETR;
        return new IsoscelesTrapezoid(firstDistance, secondDistance, height, colorFigure);
    }

    public Figure getDefaultFigure() {
        int deFaultRadius = 10;
        String defaultWhiteColor = Color.WHITE.name();
        return new Circle(deFaultRadius, defaultWhiteColor);
    }
}
