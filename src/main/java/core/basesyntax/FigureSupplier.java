package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UNITS = 1000;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = new Random().nextInt(Figures.values().length);
        Figures figures = Figures.values()[index];
        return figures == Figures.Circle ? getCircle(color) : figures == Figures.IsoscelesTrapezoid
                ? getIsoscelesTrapezoid(color) : figures == Figures.Rectangle ? getRectangle(color)
                : figures == Figures.RightTriangle ? getRightTriangle(color) : getSquare(color);
    }

    private Figure getCircle(String color) {
        int side = random.nextInt(UNITS);
        return new Circle(side, color);
    }

    private Figure getIsoscelesTrapezoid(String color) {
        int sideA = random.nextInt(UNITS);
        int sideB = random.nextInt(UNITS);
        int height = random.nextInt(UNITS);
        return new IsoscelesTrapezoid(sideA, sideB, height, color);
    }

    private Figure getRectangle(String color) {
        int sideA = random.nextInt(UNITS);
        int sideB = random.nextInt(UNITS);
        return new Rectangle(sideA, sideB, color);
    }

    private Figure getRightTriangle(String color) {
        int firstLeg = random.nextInt(UNITS);
        int secondLeg = random.nextInt(UNITS);
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getSquare(String color) {
        int side = random.nextInt(UNITS);
        return new Square(side, color);
    }
}
