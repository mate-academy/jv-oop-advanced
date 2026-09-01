package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);

        return switch (figureType) {
            case 0 -> new Square(colorSupplier.getRandomColor(), getRandomValue());
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    getRandomValue(), getRandomValue());
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomValue(), getRandomValue());
            case 3 -> new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case 4 ->
                    new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                            getRandomValue(), getRandomValue(), getRandomValue());
            default -> throw new IllegalStateException("Unknown figure type");
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private double getRandomValue() {
        return 1 + random.nextDouble() * 99;
    }
}
