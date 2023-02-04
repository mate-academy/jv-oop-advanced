package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Figure getSquare() {
        int side = random.nextInt(RADIUS);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Figure getRectangle() {
        int length = random.nextInt(RADIUS);
        int width = random.nextInt(RADIUS);
        return new Rectangle(colorSupplier.getRandomColor(), length, width);
    }

    private Figure getRightTriangle() {
        int firstLeg = random.nextInt(RADIUS);
        int secondLeg = random.nextInt(RADIUS);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Figure getCircle() {
        int radius = random.nextInt(RADIUS);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Figure getIsoscelesTrapezoid() {
        int firstSide = random.nextInt(RADIUS);
        int secondSide = random.nextInt(RADIUS);
        int heigth = random.nextInt(RADIUS);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide, secondSide,
                heigth);

    }

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
        String color = "white";
        return new Circle(color,DEFAULT_RADIUS);
    }
}
