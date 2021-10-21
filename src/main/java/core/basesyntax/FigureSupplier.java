package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 12;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }

    public Figure getRandomSquare() {
        int side = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int base = random.nextInt(MAX_VALUE);
        int height = random.nextInt(MAX_VALUE);
        int side = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, base, height, side);
    }

    public Figure getRandomRightTriangle() {
        int base = random.nextInt(MAX_VALUE);
        int height = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, base, height);
    }

    public Figure getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Figure getRandomRectangle() {
        int length = random.nextInt(MAX_VALUE);
        int width = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, length, width);
    }
}
