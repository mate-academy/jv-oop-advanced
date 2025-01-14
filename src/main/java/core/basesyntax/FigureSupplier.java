package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(4);
        switch (index) {
            case 0:
                return new Circle(new Random().nextDouble(50), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(new Random().nextDouble(50), new Random().nextDouble(50),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(new Random().nextDouble(50), new Random().nextDouble(50),
                        colorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(new Random().nextDouble(50),
                        new Random().nextDouble(50),
                        new Random().nextDouble(100), colorSupplier.getRandomColor());
            case 4:
                return new Square(new Random().nextDouble(100), colorSupplier.getRandomColor());
        }
        return getDefaultFigure();
    }
    public Figure getDefaultFigure() {
        return new Circle(10, Color.white.name());
    }
}
