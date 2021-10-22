package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 15;
    private static final int DEFAULT_NUMBER = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(DEFAULT_NUMBER);
        switch (index) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private Figure getRandomRectangle() {
        double sideA = random.nextInt(MAX_LENGTH);
        double sideB = random.nextInt(MAX_LENGTH);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color, sideA, sideB);
    }

    private Figure getRandomCircle() {
        double radius = random.nextInt(MAX_LENGTH);
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        double sideA = random.nextInt(MAX_LENGTH);
        double sideB = random.nextInt(MAX_LENGTH);
        double height = random.nextInt(MAX_LENGTH);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, sideA, sideB, height);
    }

    private Figure getRandomSquare() {
        double side = random.nextInt(MAX_LENGTH);
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Figure getRandomRightTriangle() {
        double width = random.nextInt(MAX_LENGTH);
        double height = random.nextInt(MAX_LENGTH);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color, width, height);
    }
}
