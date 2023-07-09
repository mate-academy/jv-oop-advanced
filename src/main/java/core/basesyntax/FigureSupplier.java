package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {

        String color = new ColorSupplier().getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                double side = getRandomSide();
                return new Square(side, color);
            case 1:
                double radius = getRandomRadius();
                return new Circle(radius, color);
            case 2:
                double baseOne = getRandomBase();
                double baseTwo = getRandomBase();
                double height = getRandomHeight();
                return new IsoscelesTrapezoid(baseOne, baseTwo, height,
                        color);
            case 3:
                double sideA = getRandomSide();
                double sideB = getRandomSide();
                return new Rectangle(sideA, sideB, color);
            case 4:
                double catOne = getRandomCat();
                double catTwo = getRandomCat();
                return new RightTriangle(catOne, catTwo, color);
            default:
                return new Square(12, "Pink");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

    private double getRandomHeight() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomRadius() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomSide() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomBase() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomCat() {
        return random.nextDouble() * 10 + 1;
    }
}
