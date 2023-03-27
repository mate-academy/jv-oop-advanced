package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final String color = colorSupplier.getRandomColor();
        final int index = random.nextInt(5);
        final int randomLength_1 = random.nextInt(100);
        final int randomLength_2 = random.nextInt(100);
        final int randomLength_3 = random.nextInt(100);

        switch (index) {
            case 0:
                return new Circle(randomLength_1, color);
            case 1:
                return new IsoscelesTrapezoid(randomLength_1, randomLength_2,
                        randomLength_3, color);
            case 2:
                return new Rectangle(randomLength_1, randomLength_2, color);
            case 3:
                return new RightTriangle(randomLength_1, randomLength_2, color);
            default:
                return new Square(randomLength_1, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
