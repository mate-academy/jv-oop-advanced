package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];
        switch (figureType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                        random.nextInt(BOUND));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                        random.nextInt(BOUND));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                        random.nextInt(BOUND), random.nextInt(BOUND));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getValue(), 10);
    }
}
