package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 70;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int numberFigure = random.nextInt(7);
        switch (numberFigure) {
            case 1:
                return prepareSquare();
            case 2:
                return prepareRectangle();
            case 3:
                return prepareCircle();
            case 4:
                return prepareIsoscelesTrapezoid();
            case 5:
                return prepareRightTriangle();
            default:
                return getDefaultFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private Figure prepareSquare() {
        int side = random.nextInt(LIMIT);
        return new Square(side, colorSupplier.getRandomColor());
    }

    private Figure prepareCircle() {
        int radius = random.nextInt(LIMIT);
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    private Figure prepareRectangle() {
        int width = random.nextInt(LIMIT);
        int height = random.nextInt(LIMIT);
        return new Rectangle(width, height, colorSupplier.getRandomColor());
    }

    private Figure prepareIsoscelesTrapezoid() {
        int edgeA = random.nextInt(LIMIT);
        int edgeB = random.nextInt(LIMIT);
        int height = random.nextInt(LIMIT);
        return new IsoscelesTrapezoid(edgeA, edgeB, height, colorSupplier.getRandomColor());
    }

    private Figure prepareRightTriangle() {
        int firstLeg = random.nextInt(LIMIT);
        int secondLeg = random.nextInt(LIMIT);
        return new Rectangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
    }
}
