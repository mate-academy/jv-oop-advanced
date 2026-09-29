package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_MAX = 100;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier(this.random);
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int input = random.nextInt(RANDOM_MAX) + 1;

        return switch (figureType) {
            case 0 -> new Circle(color, input);
            case 1 -> new IsoscelesTrapezoid(color, input, input, input);
            case 2 -> new RightTriangle(color, input, input);
            case 3 -> new Rectangle(color, input, input);
            case 4 -> new Square(color, input);
            default -> new Circle("white", 10);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
