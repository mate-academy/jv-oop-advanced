package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int FIGURE_COUNT = random.nextInt(5);

        return switch (FIGURE_COUNT) {
            case 0 -> new Square(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * 10);
            case 1 -> new Rectangle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * 10,
                    random.nextDouble() * 10);
            case 2 ->
                    new RightTriangle(
                            colorSupplier.getRandomColor(),
                            random.nextDouble() * 10,
                            random.nextDouble() * 10);
            case 3 -> new Circle(
                    colorSupplier.getRandomColor(),
                    random.nextDouble() * 10);
            case 4 ->
                    new IsoscelesTrapezoid(
                            colorSupplier.getRandomColor(),
                            random.nextDouble() * 10,
                            random.nextDouble() * 10,
                            random.nextDouble() * 10);
            default -> throw new IllegalArgumentException("Unexpected value: " + FIGURE_COUNT);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10.0);
    }
}
