package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int randomValue = new Random().nextInt(5);
        switch (randomValue) {
            case 1:
                return new Square(getRandomDouble(), ColorSupplier.getRandomColor());
            case 2:
                return new Circle(getRandomDouble(), ColorSupplier.getRandomColor());
            case 3:
                return new Rectangle(getRandomDouble(), getRandomDouble(),
                        ColorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(getRandomDouble(), getRandomDouble(),
                        ColorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), ColorSupplier.getRandomColor());
        }
    }

    private double getRandomDouble() {
        return new Random().nextDouble() * 10;
    }
}
