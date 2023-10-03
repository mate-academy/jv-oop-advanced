package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int vaultOfClasses = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor = colorSupplier.getRandomColor();

    public String getRandomColor() {
        return randomColor;
    }

    public void setRandomColor(String randomColor) {
        this.randomColor = randomColor;
    }

    public Figure getRandomFigure() {
        int randomValue = random.nextInt(vaultOfClasses);
        int index = random.nextInt(5);
        if (index == 0) {
            return new Circle(randomColor, randomValue);
        }
        if (index == 1) {
            return new Square(randomColor, randomValue);
        }
        if (index == 2) {
            return new Rectangle(randomColor, randomValue, randomValue);
        }
        if (index == 3) {
            return new RightTriangle(randomColor, randomValue, randomValue);
        }
        return new IsoscelesTrapezoid(randomColor,
                randomValue, randomValue, randomValue);
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
