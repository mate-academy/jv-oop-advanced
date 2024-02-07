package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_UNIT = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
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
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_UNIT) + 1;
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int longBase = random.nextInt(MAX_UNIT) + 1;
        int shortBase = random.nextInt(longBase - 1) + 1;
        int height = random.nextInt(MAX_UNIT) + 1;
        return new IsoscelesTrapezoid(color, shortBase, longBase, height);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int length = random.nextInt(MAX_UNIT) + 1;
        int width = random.nextInt(length - 1) + 1;
        return new Rectangle(color, length, width);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_UNIT) + 1;
        int secondLeg = random.nextInt(MAX_UNIT) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_UNIT) + 1;
        return new Square(color,side);
    }

}
