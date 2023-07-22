package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final int randomSite = random.nextInt(100) + 1;
    private final int figureCount = random.nextInt(FIGURE_COUNT);
    private final FigureList[] values = FigureList.values();
    private final FigureList randomFigureType = values[figureCount];
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String randomColor = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        switch (randomFigureType) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRightTriangle();
        }
    }

    private Figure getRandomCircle() {
        double radius = random.nextInt(randomSite);
        return new Circle(radius, randomColor);
    }

    private Figure getRandomSquare() {
        double side = random.nextInt(randomSite);
        return new Square(side, randomColor);
    }

    private Figure getRandomRectangle() {
        double length = random.nextInt(randomSite);
        double width = random.nextInt(randomSite);
        return new Rectangle(length, width, randomColor);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        double sideA = random.nextInt(randomSite);
        double sideB = random.nextInt(randomSite);
        double height = random.nextInt(randomSite);
        return new IsoscelesTrapezoid(sideA, sideB, height, randomColor);
    }

    private Figure getRandomRightTriangle() {
        double firstLeg = random.nextInt(randomSite);
        double secondLeg = random.nextInt(randomSite);
        return new RightTriangle(firstLeg, secondLeg, randomColor);
    }

    public Figure getDefaultFigure() {
        double radius = 10;
        String color = "WHITE";
        return new Circle(radius, color);
    }
}
