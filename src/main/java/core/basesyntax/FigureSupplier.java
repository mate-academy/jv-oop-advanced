package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int RANDOM_SIDE = 9;
    private Random random = new Random();
    private int side = random.nextInt(RANDOM_SIDE);
    private ColorSupplier colorSupplire = new ColorSupplier();
    private String color = colorSupplire.getRandomColor();

    public Figure getRandom() {
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
        Circle circle = new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name().toLowerCase());
        return circle;
    }
}
