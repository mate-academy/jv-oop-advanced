package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String color = "white";
    private static final int MAX_SIZE = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getSquare();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getCircle();
            case 4:
                return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        //String color = "white";
        return new Circle(color,DEFAULT_RADIUS);
    }

    private Figure getSquare() {
        int side = random.nextInt(MAX_SIZE);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Figure getRectangle() {
        int length = random.nextInt(MAX_SIZE);
        int width = random.nextInt(MAX_SIZE);
        return new Rectangle(colorSupplier.getRandomColor(), length, width);
    }

    private Figure getRightTriangle() {
        int firstLeg = random.nextInt(MAX_SIZE);
        int secondLeg = random.nextInt(MAX_SIZE);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Figure getCircle() {
        int radius = random.nextInt(MAX_SIZE);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Figure getIsoscelesTrapezoid() {
        int firstSide = random.nextInt(MAX_SIZE);
        int secondSide = random.nextInt(MAX_SIZE);
        int height = random.nextInt(MAX_SIZE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide, secondSide,
                height);

    }

}
