package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int MAX_SIDE = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_TYPES);
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        switch (randomFigure) {
            case (0):
                Figure square = new Square((new Random().nextInt(MAX_SIDE)
                        + 1), color);
                return square;
            case (1):
                Figure rectangle = new Rectangle((new Random().nextInt(MAX_SIDE)
                        + 1), (new Random().nextInt(MAX_SIDE) + 1), color);
                return rectangle;
            case (2):
                Figure rightTriangle = new RightTriangle((new Random().nextInt(MAX_SIDE)
                        + 1), (new Random().nextInt(MAX_SIDE) + 1), color);
                return rightTriangle;
            case (3):
                Figure circle = new Circle((new Random().nextInt(MAX_SIDE)
                        + 1), color);
                return circle;
            default:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid((new Random().nextInt(MAX_SIDE)
                        + 1), (new Random().nextInt(MAX_SIDE) + 1),
                        (new Random().nextInt(MAX_SIDE) + 1), color);
                return isoscelesTrapezoid;
        }

    }
    
    public Figure getDefaultFigure() {
        Figure defaultFigure = new Square(10, "white");
        return defaultFigure;
    }
}
