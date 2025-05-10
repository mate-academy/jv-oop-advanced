package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (FiguresName.values()[random.nextInt(FiguresName.values().length)]) {
            case CIRCLE :
                return new Circle(random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
            case SQUARE :
                return new Square(random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
            case RIGHTTRIANGLE :
                return new RightTriangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
            case ISOSCELESTRAPEZOID :
                return new IsoscelesTrapezoid(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE), colorSupplier.getRandomColor());
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white");
    }
}
