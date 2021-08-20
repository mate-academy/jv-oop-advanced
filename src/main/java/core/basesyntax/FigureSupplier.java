package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return addCircle(colorSupplier.getRandomColor());
            case 2:
                return addRightTriangle(colorSupplier.getRandomColor());
            case 3:
                return addRectangle(colorSupplier.getRandomColor());
            case 4:
                return addSquare(colorSupplier.getRandomColor());
            default:
                return addIsoscelesTrapezoid(colorSupplier.getRandomColor());
        }
    }

    public Figure addCircle(String color) {
        int radius = random.nextInt(20);
        return new Circle(color, radius);
    }

    public Figure addRightTriangle(String color) {
        int firstLeg = random.nextInt(20);
        int secondLeg = random.nextInt(20);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure addRectangle(String color) {
        int firstSide = random.nextInt(20);
        int secondSide = random.nextInt(20);
        return new Rectangle(color, firstSide, secondSide);
    }

    public Figure addSquare(String color) {
        int side = random.nextInt(20);
        return new Square(color, side);
    }

    public Figure addIsoscelesTrapezoid(String color) {
        int sideA = random.nextInt(20);
        int sideB = random.nextInt(20);
        int height = random.nextInt(20);
        return new IsoscelesTrapezoid(color, sideA, sideB, height);
    }
}
