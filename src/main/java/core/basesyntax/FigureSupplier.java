package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_INDEX = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);

        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandom());
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandom(), getRandom());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandom(),
                        getRandom(), getRandom());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(), getRandom(), getRandom());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandom());
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        circle.setColor(Color.WHITE.toString().toLowerCase());
        return circle;
    }

    private int getRandom() {
        return random.nextInt(RANDOM_INDEX);
    }
}
