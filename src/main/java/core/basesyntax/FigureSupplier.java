package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 10;
    private static final int CIRCLE_RADIUS = 10;
    private static final int BOUND_FOR_SWITCH = 4;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int index = new Random().nextInt(BOUND_FOR_SWITCH);
        switch (index) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(LIMIT));

            case (1):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT), random.nextInt(LIMIT));

            case (2):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT), random.nextInt(LIMIT),random.nextInt(LIMIT));

            case (3):
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT), random.nextInt(LIMIT));

            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(LIMIT));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), CIRCLE_RADIUS);
    }
}
