package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 100;
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        double radius = randomSize();
        double side = randomSize();
        double height = randomSize();
        double width = randomSize();

        switch (randomFigure) {
            case 0:
                return new Circle(randomColor, radius);
            case 1:
                return new IsoscelesTrapezoid(randomColor, side, side, height);
            case 2:
                return new Rectangle(randomColor, height, width);
            case 3:
                return new RightTriangle(randomColor, side, side);
            case 4:
                return new Square(randomColor, side);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final int default_radius = 10;
        final String default_color = Color.WHITE.name();
        return new Circle(default_color, default_radius);
    }

    public int randomSize() {
        return random.nextInt(MAX_FIGURE_SIZE);
    }
}
