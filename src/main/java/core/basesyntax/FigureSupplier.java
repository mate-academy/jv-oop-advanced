package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = 5;
    private static final int MAX_LENGTH = 101;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_FIGURE)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH),
                        random.nextInt(MAX_LENGTH));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGTH));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }
}
