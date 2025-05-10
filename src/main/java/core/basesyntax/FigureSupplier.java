package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 20;

    public Figure getRandomFigure() {
        int figureNumber = new Random().nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), DEFAULT_RADIUS);
    }

    public Figure getRandomCircle() {
        String color = new ColorSupplier().getRandomColor();
        int radius = new Random().nextInt(MAX_NUMBER);
        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        String color = new ColorSupplier().getRandomColor();
        int upperSide = new Random().nextInt(MAX_NUMBER);
        int lowerSide = new Random().nextInt(MAX_NUMBER);
        int height = new Random().nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(color, height, upperSide, lowerSide);
    }

    public Figure getRandomRectangle() {
        String color = new ColorSupplier().getRandomColor();
        int upperSide = new Random().nextInt(MAX_NUMBER);
        int lowerSide = new Random().nextInt(MAX_NUMBER);
        return new Rectangle(color, upperSide, lowerSide);
    }

    public Figure getRandomRightTriangle() {
        String color = new ColorSupplier().getRandomColor();
        int height = new Random().nextInt(MAX_NUMBER);
        int side = new Random().nextInt(MAX_NUMBER);
        return new RightTriangle(color, height, side);
    }

    public Figure getRandomSquare() {
        String color = new ColorSupplier().getRandomColor();
        int side = new Random().nextInt(MAX_NUMBER);
        return new Square(color, side);
    }
}
