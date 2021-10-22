package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int maxNumber = 6;
    private static final Random random = new Random();
    private static final int maxSide = 20;
    private static final int defaultRadius = 10;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), defaultRadius);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int side = random.nextInt(maxSide);
        return new Rectangle(color, side, side);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int side = random.nextInt(maxSide);
        return new Square(color, side);
    }

    private Figure getRandomTrapezoid() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int sideA = random.nextInt(maxSide);
        int sideB = random.nextInt(maxSide);
        int height = random.nextInt(maxSide);
        return new IsoscelesTrapezoid(color, sideA, sideB, height);
    }

    private Figure getRandomTriangle() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int sideA = random.nextInt(maxSide);
        int sideB = random.nextInt(maxSide);
        return new RightTriangle(color, sideA, sideB);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor().toLowerCase();
        int radius = random.nextInt(maxSide);
        return new Circle(color, radius);
    }

    public Figure getRandomFigure() {
        int i = random.nextInt(maxNumber);
        switch (i) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomTrapezoid();
            case 5:
            default:
                return getRandomTriangle();
        }
    }
}

