package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 28;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_NUMBER);
        return new Circle(color, side);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int upperTrapezoid = random.nextInt(MAX_NUMBER);
        int lowerTrapezoid = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(color, upperTrapezoid, lowerTrapezoid, height);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(MAX_NUMBER);
        int width = random.nextInt(MAX_NUMBER);
        return new Rectangle(color, length, width);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_NUMBER);
        return new Square(color, side);
    }
}
