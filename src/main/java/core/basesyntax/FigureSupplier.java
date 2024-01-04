package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return switch (figureNumber) {

            case 0 -> new Circle(random.nextDouble() * 10 + 1,
                    AbstractFigure.getRandomColor()) {
                @Override
                public Color getColor() {
                    return null;
                }
            };
            case 1 -> new Rectangle(random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    AbstractFigure.getRandomColor()) {
                @Override
                public Color getColor() {
                    return null;
                }
            };
            case 2 -> new RightTriangle(random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    AbstractFigure.getRandomColor()) {
                @Override
                public Color getColor() {
                    return null;
                }
            };
            case 3 -> new Square(random.nextDouble() * 10 + 1,
                    AbstractFigure.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    AbstractFigure.getRandomColor()) {
                @Override
                public Color getColor() {
                    return null;
                }
            };
            default -> throw new IllegalStateException("Unexpected value: "
                    + figureNumber);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, AbstractFigure.getDefaultColor()) {
            @Override
            public Color getColor() {
                return null;
            }
        };
    }
}
