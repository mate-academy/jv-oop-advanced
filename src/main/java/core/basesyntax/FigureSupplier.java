package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        double value = random.nextDouble() * 10;

        return switch (figureType) {
            case 0 -> new Square(color, value);
            case 1 -> new Rectangle(color, value, value);
            case 2 -> new RightTriangle(color, value, value);
            case 3 -> new Circle(color, value);
            case 4 -> new IsoscelesTrapezoid(color, value, value, value);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
