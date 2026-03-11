package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        return switch (figureType) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 1 -> new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 2 ->
                    new Rectangle(
                            colorSupplier.getRandomColor(),
                            random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1);
            case 3 ->
                    new RightTriangle(
                            colorSupplier.getRandomColor(),
                            random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1);
            case 4 ->
                    new IsoscelesTrapezoid(
                            colorSupplier.getRandomColor(),
                            random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1,
                            random.nextDouble() * 10 + 1);
            default -> new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 5 + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
