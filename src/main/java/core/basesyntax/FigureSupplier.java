package core.basesyntax;

import core.basesyntax.models.*;
import java.util.Random;

class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        return switch (type) {
            case 0 -> new Square(color, random.nextDouble() * 10 + 1);
            case 1 -> new Rectangle(color, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 2 -> new RightTriangle(color, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1);
            case 3 -> new Circle(color, random.nextDouble() * 10 + 1);
            case 4 ->
                    new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}

