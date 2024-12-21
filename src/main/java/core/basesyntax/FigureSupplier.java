package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIRST_MAX_NUMBER = 5;
    private static final int SECOND_MAX_NUMBER = 100;
    private static final int RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int max1 = random.nextInt(SECOND_MAX_NUMBER) + 1;
        int max2 = random.nextInt(SECOND_MAX_NUMBER) + 1;
        Figure figure = switch (random.nextInt(FIRST_MAX_NUMBER) + 1) {
            case 1 -> new Rectangle(max1, max2);
            case 2 -> new RightTriangle(max1, max2);
            case 3 -> new Ellipse(max1, max2);
            case 4 -> new Square(max1);
            case 5 -> new IsoscelesTrapezoid(max1, max2, max2);
            default -> throw new IllegalArgumentException("Unexpected value");
        };
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(RADIUS);
        figure.setColor("WHITE");
        return figure;
    }
}
