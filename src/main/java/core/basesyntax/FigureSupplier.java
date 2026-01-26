package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = "White";
    private static final int MAX_SIDE_LENGTH = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int side = randomSide();
        switch (figure) {
            case 0:
                return new Square(color, side);
            case 1:
                return new Rectangle(color, side, side);
            case 2:
                return new RightTriangle(color, side, side);
            case 3:
                return new Circle(color, side);
            default:
                return new IsoscelesTrapezoid(
                        color,
                        side,
                        side,
                        side
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }

    private int randomSide() {
        return random.nextInt(MAX_SIDE_LENGTH) + 1;
    }
}
