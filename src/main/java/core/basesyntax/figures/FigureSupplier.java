package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int SIZE_LIMIT = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int figureInt = random.nextInt(5);
        switch (figureInt) {
            case 0:
                return new Circle(random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor());

            case 1:
                return new Square(random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor());

            case 2:
                return new IsoscelesTrapezoid(random.nextInt(SIZE_LIMIT),
                        random.nextInt(SIZE_LIMIT),
                        random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor());

            case 3:
                return new RightTriangle(random.nextInt(SIZE_LIMIT),
                        random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor());

            case 4:
                return new Rectangle(random.nextInt(SIZE_LIMIT),
                        random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor());

            default:
                return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());

        }

    }

    public Figure getDefaultFigure() {

        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
