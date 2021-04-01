package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_NUMBER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return getNewCircle();
            case 1:
                return getNewRectangle();
            case 2:
                return getNewSquare();
            case 3:
                return getNewIsoscelesTrapezoid();
            default:
                return getNewRightTriangle();
        }
    }

    public Circle getNewCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Circle("circle", color, radius);
    }

    public Rectangle getNewRectangle() {
        int width = random.nextInt(MAX_NUMBER);
        int length = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Rectangle("rectangle", color, width, length);
    }

    public Square getNewSquare() {
        int side = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new Square("square", color, side);
    }

    public IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int firstBase = random.nextInt(MAX_NUMBER);
        int secondBase = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid("isosceles trapezoid", color, firstBase, secondBase, height);
    }

    public RightTriangle getNewRightTriangle() {
        int sideA = random.nextInt(MAX_NUMBER);
        int sideB = random.nextInt(MAX_NUMBER);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle("right triangle", color, sideA, sideB);
    }
}
