package core.basesyntax;

import core.basesyntax.Figures.*;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Figure getFigureRandom() {
        int choice = random.nextInt(5);

        switch (choice) {
            case 0:
                return new Square(colorSupplier.getRandomColor().toString(),
                        random.nextInt() * 10 + 1);
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor().toString(),
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 2:
                return new Circle(colorSupplier.getRandomColor().toString(),
                        random.nextInt() * 10 + 1);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor().toString(),
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor().toString(),
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
