package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double defaultRadius = 10;
    private static final String defaultColor = "White";
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(5);
        double randomFrom = 1;
        double randomTo = 10;
        double side1 = random.nextDouble(randomFrom,randomTo);
        double side2 = 0;
        if (figureNumber >= 2) {
            side2 = random.nextDouble(randomFrom, randomTo);
        }
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(side1, color);
            case 1:
                return new Circle(side1, color);
            case 2:
                return new RightTriangle(side1, side2, color);
            case 3:
                return new Rectangle(side1, side2, color);
            case 4:
                return new IsoscelesTrapezoid(side1, side2,
                        side1 * side2, color);
            default:
                return new Circle(defaultRadius, defaultColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }
}
