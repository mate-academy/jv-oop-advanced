package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random randomTypeOfFigure = new Random();
        switch (randomTypeOfFigure.nextInt(5)) {
            case (0):
                return new Circle(new ColorSupplier().getRandomColor(), new Random().nextInt(20));
            case (1):
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                      new Random().nextInt(20),
                      new Random().nextInt(20),
                      new Random().nextInt(20));
            case (2):
                return new Rectangle(new ColorSupplier().getRandomColor(),
                      new Random().nextInt(20),
                      new Random().nextInt(20));
            case (3):
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                      new Random().nextInt(20),
                      new Random().nextInt(20));
            case (4):
                return new Square(new ColorSupplier().getRandomColor(), new Random().nextInt(20));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
