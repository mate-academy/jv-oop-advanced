package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figureRandom = null;
        String colorRandom = supplier.getRandomColor().toLowerCase();

        switch (random.nextInt(NUMBERS_OF_FIGURES)) {
            case 0: // Square
                double side = random.nextDouble();
                figureRandom = new Square(colorRandom, side);
                break;
            case 1: // Rectangle
                double sideA = random.nextDouble();
                double sideB = random.nextDouble();
                figureRandom = new Rectangle(colorRandom, sideA, sideB);
                break;
            case 2: // RightTriangle
                double firstLeg = random.nextDouble();
                double secondLeg = random.nextDouble();
                figureRandom = new RightTriangle(colorRandom, firstLeg, secondLeg);
                break;
            case 3: // Circle
                double radius = random.nextDouble();
                figureRandom = new Circle(colorRandom, radius);
                break;
            default: // IsoscelesTrapezoid
                double baseUpper = random.nextDouble();
                double baseLover = random.nextDouble();
                double sideLateral = random.nextDouble();
                figureRandom = new IsoscelesTrapezoid(colorRandom,
                        baseUpper,
                        baseLover,
                        sideLateral);
        }

        return figureRandom;
    }

    public Figure getDefaultFigure() {
        String color = ColorOfFigure.WHITE.name().toLowerCase();
        return new Circle(color, 10);
    }
}
