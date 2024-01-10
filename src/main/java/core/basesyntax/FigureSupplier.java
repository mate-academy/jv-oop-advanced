package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MIN_SIDE = 1;
    private static final int MAX_SIDE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomSide());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSide(), getRandomSide());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSide(), getRandomSide());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomSide());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSide(), getRandomSide(), getRandomSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double getRandomSide() {
        return random.nextInt(MIN_SIDE, MAX_SIDE);
    }
}
