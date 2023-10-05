package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int vaultOfClasses = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int randomValue = random.nextInt(vaultOfClasses);
        int index = random.nextInt(5);
        if (index == 0) {
            return new Circle(color, randomValue);
        }
        if (index == 1) {
            return new Square(color, randomValue);
        }
        if (index == 2) {
            return new Rectangle(color, randomValue, randomValue);
        }
        if (index == 3) {
            return new RightTriangle(color, randomValue, randomValue);
        }
        return new IsoscelesTrapezoid(color,
                randomValue, randomValue, randomValue);
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
