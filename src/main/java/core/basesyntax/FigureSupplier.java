package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_DIM = 1;
    private static final int MAX_DIM = 10;
    private static final int FIGURE_TYPES = 5;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomValue() {
        return MIN_DIM + RANDOM.nextInt(MAX_DIM - MIN_DIM + 1);
    }

    public Figure getRandomFigure() {
        int randomFigure = RANDOM.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();

        if (randomFigure == 0) {
            double side = randomValue();
            return new Square(color, side);
        } else if (randomFigure == 1) {
            double firstSide = randomValue();
            double secondSide = randomValue();
            return new Rectangle(color, firstSide, secondSide);
        } else if (randomFigure == 2) {
            double firstLeg = randomValue();
            double secondLeg = randomValue();
            return new RightTriangle(color, firstLeg, secondLeg);
        } else if (randomFigure == 3) {
            double radius = randomValue();
            return new Circle(color, radius);
        } else {
            double firstBase = randomValue();
            double secondBase = randomValue();
            double height = randomValue();
            return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
        }
    }

}
