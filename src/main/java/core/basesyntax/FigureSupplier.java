package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int RANDOM_SIDE = 9;
    private Random random = new Random();
    private ColorSupplier colorSupplire = new ColorSupplier();

    public Figure getRandom() {
        int side = random.nextInt(RANDOM_SIDE);
        String color = colorSupplire.getRandomColor();
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(side, color);
            case 2:
                return new Square(side, color);
            case 3:
                return new Rectangle(side, side, color);
            case 4:
                return new RightTriangle(side, side, color);
            default:
                return new IsoscelesTrapezoid(side, side, side, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name().toLowerCase());
    }
}
