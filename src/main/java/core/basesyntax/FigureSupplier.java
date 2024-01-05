package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        switch (new Random().nextInt(Shapes.values().length) + 1) {
            case 1: return new Circle(
                    new Random().nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 2: return new Square(
                    new Random().nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 3: return new Rectangle(
                    new Random().nextDouble(100),
                    new Random().nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 4: return new RightTriangle(
                    new Random().nextDouble(100),
                    new Random().nextDouble(100),
                    ColorSupplier.getRandomColor());
            case 5: return new IsoscelesTrapezoid(
                    new Random().nextDouble(100),
                    new Random().nextDouble(100),
                    new Random().nextDouble(100),
                    ColorSupplier.getRandomColor());
            default: return new Circle(10, "white");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
