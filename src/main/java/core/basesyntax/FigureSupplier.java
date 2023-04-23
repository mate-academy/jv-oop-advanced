package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int MAX_RANGE = 20;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNameFigure = new Random().nextInt(FiguresName.values().length);
        switch (FiguresName.values()[randomNameFigure]) {
            case CIRCLE:
                Figure circle = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1);
                return circle;
            case SQUARE:
                Figure square = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1);
                return square;
            case RIGHT_TRIANGLE:
                Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
                return rightTriangle;
            case RECTANGLE:
                Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
                return rectangle;
            default:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
        return circle;
    }
}
