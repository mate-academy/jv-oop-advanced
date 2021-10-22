package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        switch (new Random().nextInt(4)) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(), new Random().nextInt(20));
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(20),
                        new Random().nextInt(20));
            case 2:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(20),
                        new Random().nextInt(20));
            case 3:
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(20));
            case 4:
                return new IsoscelesTraprzoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(20),
                        new Random().nextInt(20),
                        new Random().nextInt(20));
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
