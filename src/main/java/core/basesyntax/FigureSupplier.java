package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public static final int FIGURE_COUNT;

    static {
        FIGURE_COUNT = 5;
    }

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        return switch (figureNumber) {
            case 0 -> new Square(random.nextDouble() * 10 + 1,
                    Color.getRandomColor());
            case 1 -> new Rectangle(random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    Color.getRandomColor());
            case 2 ->
                    new RightTriangle(random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1,
                            Color.getRandomColor());
            case 3 -> new Circle(random.nextDouble() * 10 + 1,
                    Color.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, Color.getRandomColor());
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

}
