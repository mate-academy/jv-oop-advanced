package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_SIDE_LENGTH = 10;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_NUMBER);
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

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_SIDE_LENGTH);
        return new Square(color, side);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_SIDE_LENGTH);
        int secondLeg = random.nextInt(MAX_SIDE_LENGTH);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(MAX_SIDE_LENGTH);
        int width = random.nextInt(MAX_SIDE_LENGTH);
        return new Rectangle(color, length, width);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int top = random.nextInt(MAX_SIDE_LENGTH);
        int base = random.nextInt(MAX_SIDE_LENGTH);
        int height = random.nextInt(MAX_SIDE_LENGTH);
        return new IsoscelesTrapezoid(color, top, base, height);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_SIDE_LENGTH);
        return new Circle(color, side);
    }
}
