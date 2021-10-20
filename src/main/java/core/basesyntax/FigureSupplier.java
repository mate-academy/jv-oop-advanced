package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_FIGURE_NUMBER = 5;
    public static final int CONSTANT_RADIUS = 10;
    private final Random figureRandom = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random sideRandom = new Random();

    public Figure getRandomFigure() {
        int figureNumber = figureRandom.nextInt(MAX_FIGURE_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
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
        return new Circle(Color.WHITE.name(), CONSTANT_RADIUS);
    }

    public Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = sideRandom.nextInt(10) + 1;
        return new Circle(color, radius);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int base = sideRandom.nextInt(10) + 1;
        int height = sideRandom.nextInt(10) + 1;
        int top = sideRandom.nextInt(10) + 1;
        return new IsoscelesTrapezoid(color, base, height, top);
    }

    public Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int sideA = sideRandom.nextInt(10) + 1;
        int sideB = sideRandom.nextInt(10) + 1;
        return new Rectangle(color, sideA, sideB);
    }

    public RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = sideRandom.nextInt(10) + 1;
        int secondLeg = sideRandom.nextInt(10) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = sideRandom.nextInt(10) + 1;
        return new Square(color, side);
    }
}
