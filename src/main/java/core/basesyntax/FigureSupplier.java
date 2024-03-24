package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figure = random.nextInt(5);
        switch (figure) {
            case 0: return new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble(),
                    getRandomDouble());
            case 2: return new Rectangle(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble());
            case 3: return new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble());
            default: return new Square(colorSupplier.getRandomColor(),
                    getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    private int getRandomInt() {
        return new Random().nextInt(100);
    }

    private double getRandomDouble() {
        return new Random().nextDouble(100);
    }
}
