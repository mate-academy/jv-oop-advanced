package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_DIMENSION = 10;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final int MAX_FIGURES = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureType = random.nextInt(MAX_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createSquare();
            case 1:
                return createRightTriangle();
            case 2:
                return createRectangle();
            case 3:
                return createIsoscelesTrapezoid();
            case 4:
                return createCircle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_RADIUS, Color.WHITE.name());
    }

    private Circle createCircle() {
        int radius = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        String color = new ColorSupplier().getRandomColor();
        return new Circle(radius, color);
    }

    private Square createSquare() {
        int side = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        String color = new ColorSupplier().getRandomColor();
        return new Square(side, color);
    }

    private RightTriangle createRightTriangle() {
        int leg1 = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        int leg2 = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        String color = new ColorSupplier().getRandomColor();
        return new RightTriangle(leg1, leg2, color);
    }

    private Rectangle createRectangle() {
        int width = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        int height = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        String color = new ColorSupplier().getRandomColor();
        return new Rectangle(width, height, color);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        int base1 = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        int base2 = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        int height = (random.nextInt(MAX_DIMENSION) + 1) * MAX_DIMENSION;
        String color = new ColorSupplier().getRandomColor();
        return new IsoscelesTrapezoid(base1, base2, height, color);
    }
}
