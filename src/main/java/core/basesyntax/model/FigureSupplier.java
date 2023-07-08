package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURES = 5;
    private final double defaultCircleRadius = 10d;
    private final String defaultCircleColor = FigureColor.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBERS_OF_FIGURES)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomIsoscelesTrapezoid() {
        double baseUpper = random.nextDouble();
        double baseLover = random.nextDouble();
        double sideLateral = random.nextDouble();
        String colorRandom = supplier.getRandomColor().toLowerCase();
        return new IsoscelesTrapezoid(colorRandom,
                baseUpper,
                baseLover,
                sideLateral);
    }

    private Figure getRandomCircle() {
        double radius = random.nextDouble();
        String colorRandom = supplier.getRandomColor().toLowerCase();
        return new Circle(colorRandom, radius);
    }

    private Figure getRandomRightTriangle() {
        double firstLeg = random.nextDouble();
        double secondLeg = random.nextDouble();
        String colorRandom = supplier.getRandomColor().toLowerCase();
        return new RightTriangle(colorRandom, firstLeg, secondLeg);
    }

    private Figure getRandomRectangle() {
        double sideA = random.nextDouble();
        double sideB = random.nextDouble();
        String colorRandom = supplier.getRandomColor().toLowerCase();
        return new Rectangle(colorRandom, sideA, sideB);
    }

    private Figure getRandomSquare() {
        double side = random.nextDouble();
        String colorRandom = supplier.getRandomColor().toLowerCase();
        return new Square(colorRandom, side);
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultCircleColor, defaultCircleRadius);
    }
}
