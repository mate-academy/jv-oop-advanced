package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int FIGURE_COUNT = 5;
    private static final int BOUND = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);

        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                         getRandomNumber(), getRandomNumber());
            case 4:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_CIRCLE_RADIUS);
    }

    public int getRandomNumber() {
        return random.nextInt(BOUND) + 1;
    }
}
