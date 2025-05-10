package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int UNITS = 1000;
    private static final String[] FIGURES = new String[]{"CIRCLE", "RECTANGLE", "RIGHT_TRIANGLE",
            "SQUARE", "IsoscelesTrapezoid", "RightTriangle"};
    private static final int RADIUS_OF_CIRCLE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = new Random().nextInt(FIGURES.length);
        return FIGURES[index].equals("Circle") ? getDefaultFigure() :
                FIGURES[index].equals("IsoscelesTrapezoid") ? getIsoscelesTrapezoid(color) :
                        FIGURES[index].equals("Rectangle") ? getRectangle(color)
                                : FIGURES[index].equals("RightTriangle")
                                ? getRightTriangle(color) : getSquare(color);
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

    public Figure getDefaultFigure() {
        int radius = RADIUS_OF_CIRCLE;
        String color = Color.WHITE.toString();
        return new Circle(radius, color);
    }
}
