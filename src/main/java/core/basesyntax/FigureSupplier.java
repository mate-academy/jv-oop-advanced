package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int AMOUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int choice = random.nextInt(AMOUNT);
        switch (choice) {
            case (0):
                return getSquare();
            case (1):
                return getRectangle();
            case (2):
                return getRightTriangle();
            case (3):
                return getCircle();
            case (4):
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    private Figure getSquare() {
        int side = random.nextInt(30);
        return new Square(side, colorSupplier.getRandomColor());
    }

    private Figure getRectangle() {
        int width = random.nextInt(30);
        int height = random.nextInt(30);
        return new Rectangle(width, height, colorSupplier.getRandomColor());
    }

    private Figure getRightTriangle() {
        int firstLeg = random.nextInt(30);
        int secondLeg = random.nextInt(30);
        return new RightTriangle(firstLeg, secondLeg, colorSupplier.getRandomColor());
    }

    private Figure getCircle() {
        int radius = random.nextInt(30);
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    private Figure getIsoscelesTrapezoid() {
        int upperbase = random.nextInt(30);
        int lowerbase = random.nextInt(30);
        int trapezoidheight = random.nextInt(30);
        return new IsoscelesTrapezoid(upperbase, lowerbase, trapezoidheight,
                colorSupplier.getRandomColor());
    }
}


