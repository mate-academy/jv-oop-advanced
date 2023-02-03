package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 10;
    private static final int RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    //String colorRandom = colorSupplier.getRandomColor();
    private Random random = new Random();

    public Figure getSquare() {
        int side = random.nextInt(NUMBER);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    public Figure getRectangle() {
        int length = random.nextInt(NUMBER);
        int width = random.nextInt(NUMBER);
        return new Rectangle(colorSupplier.getRandomColor(), length, width);
    }

    public Figure getRightTriangle() {
        int firstLeg = random.nextInt(NUMBER);
        int secondLeg = random.nextInt(NUMBER);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    public Figure getCircle() {
        int radius = random.nextInt(NUMBER);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    public Figure getIsoscelesTrapezoid() {
        int firstSide = random.nextInt(NUMBER);
        int secondSide = random.nextInt(NUMBER);
        int heigth = random.nextInt(NUMBER);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide, secondSide,
                heigth);

    }

    public Figure getRandomFigure(String nameFigure) {
        switch (nameFigure) {
            case "SQUARE":
                return getSquare();
            case "RECTANGLE":
                return getRectangle();
            case "RIGHT_TRIANGLE":
                return getRightTriangle();
            case "CIRCLE":
                return getCircle();
            case "ISOSCELES_TRAPEZOID":
                return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        String color = "white";
        return new Circle(color,RADIUS);
    }
}
