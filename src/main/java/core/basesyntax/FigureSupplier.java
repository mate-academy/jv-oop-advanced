package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();

        double side, width, height, firstLeg, secondLeg, radius, base1, base2, trapezoidHeight;

        switch (figureType) {
            case 0:
                side = random.nextDouble() * 10;
                return new Square(color, side);
            case 1:
                width = random.nextDouble() * 10;
                height = random.nextDouble() * 10;
                return new Rectangle(color, width, height);
            case 2:
                firstLeg = random.nextDouble() * 10;
                secondLeg = random.nextDouble() * 10;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                radius = random.nextDouble() * 10;
                return new Circle(color, radius);
            case 4:
                base1 = random.nextDouble() * 10;
                base2 = random.nextDouble() * 10;
                trapezoidHeight = random.nextDouble() * 10;
                return new IsoscelesTrapezoid(color, base1, base2, trapezoidHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}


