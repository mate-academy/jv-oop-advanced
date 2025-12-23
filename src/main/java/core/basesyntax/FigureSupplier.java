package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int MAX_VALUE = 20;
    static final int FIGURE_TYPES_COUNT = 5;
    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = rand.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                double radius = rand.nextDouble(MAX_VALUE) + 1;
                return new Circle(radius, color);
            case 1:
                double side = rand.nextDouble(MAX_VALUE) + 1;
                return new Square(side, color);
            case 2:
                double side1 = rand.nextDouble(MAX_VALUE) + 1;
                double side2 = rand.nextDouble(MAX_VALUE) + 1;
                return new Rectangle(side1, side2, color);
            case 3:
                double firstLeg = rand.nextDouble(MAX_VALUE) + 1;
                double secondLeg = rand.nextDouble(MAX_VALUE) + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 4:
                double base1 = rand.nextDouble(MAX_VALUE) + 1;
                double base2 = rand.nextDouble(MAX_VALUE) + 1;
                double leg = rand.nextDouble(MAX_VALUE) + 1;
                return new IsoscelesTrapezoid(base1, base2, leg, color);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
