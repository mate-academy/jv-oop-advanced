package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureNumber) {
            case 0: return getRandomCircle();
            case 1: return getRandomIsoscelesTrapezoid();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomSquare();
            default: return new Figure(colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public Circle getRandomCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random sideRandom = new Random();
        String color = colorSupplier.getRandomColor();
        int radius = sideRandom.nextInt(10) + 1;
        return new Circle(color, radius);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random sideRandom = new Random();
        String color = colorSupplier.getRandomColor();
        int base = sideRandom.nextInt(10) + 1;
        int height = sideRandom.nextInt(10) + 1;
        int top = sideRandom.nextInt(10) + 1;
        return new IsoscelesTrapezoid(color, base, height, top);
    }

    public Rectangle getRandomRectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random sideRandom = new Random();
        String color = colorSupplier.getRandomColor();
        int sideA = sideRandom.nextInt(10) + 1;
        int sideB = sideRandom.nextInt(10) + 1;
        return new Rectangle(color, sideA, sideB);
    }

    public RightTriangle getRandomRightTriangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random sideRandom = new Random();
        String color = colorSupplier.getRandomColor();
        int firstLeg = sideRandom.nextInt(10) + 1;
        int secondLeg = sideRandom.nextInt(10) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Square getRandomSquare() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random sideRandom = new Random();
        String color = colorSupplier.getRandomColor();
        int side = sideRandom.nextInt(10) + 1;
        return new Square(color, side);
    }
}
