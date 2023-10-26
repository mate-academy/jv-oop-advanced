package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTIES_VALUE = 100;
    private static final int MAX_FIGURES_NUMBER = 5;

    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURES_NUMBER);
        switch (index) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomCircle();
            case 2:
                return createRandomIsoscelesTrapezoid();
            case 3:
                return createRandomRightTriangle();
            case 4:
                return createRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        String name = "Circle";
        int radius = 10;
        Color color = Color.WHITE;
        return new Circle(name, color, radius);
    }

    private Square createRandomSquare() {
        String name = "Square";
        Color color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_PROPERTIES_VALUE);
        return new Square(name, color, side);
    }

    private Circle createRandomCircle() {
        String name = "Circle";
        Color color = colorSupplier.getRandomColor();
        int radius = random.nextInt(MAX_PROPERTIES_VALUE);
        return new Circle(name, color, radius);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        String name = "Isosceles Trapezoid";
        Color color = colorSupplier.getRandomColor();
        int lowerBase = random.nextInt(MAX_PROPERTIES_VALUE);
        int upperBase = random.nextInt(MAX_PROPERTIES_VALUE);
        int side = random.nextInt(MAX_PROPERTIES_VALUE);
        return new IsoscelesTrapezoid(name, color, lowerBase, upperBase, side);
    }

    private Rectangle createRandomRectangle() {
        String name = "Rectangle";
        Color color = colorSupplier.getRandomColor();
        int firstSide = random.nextInt(MAX_PROPERTIES_VALUE);
        int secondSide = random.nextInt(MAX_PROPERTIES_VALUE);
        return new Rectangle(name, color, firstSide, secondSide);
    }

    private RightTriangle createRandomRightTriangle() {
        String name = "RightTriangle";
        Color color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_PROPERTIES_VALUE);
        int secondLeg = random.nextInt(MAX_PROPERTIES_VALUE);
        return new RightTriangle(name, color, firstLeg, secondLeg);
    }
}
