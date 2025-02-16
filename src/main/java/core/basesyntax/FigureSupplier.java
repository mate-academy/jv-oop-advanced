package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int figureCount = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureBase getRandomFigure() {
        int figureType = random.nextInt(figureCount);

        return switch (figureType) {
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
            default -> throw new IllegalArgumentException("Unexpected value: " + figureType);
        };
    }

    public FigureBase getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10.0);
    }
}
