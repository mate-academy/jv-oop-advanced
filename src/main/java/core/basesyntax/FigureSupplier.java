package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(5)) {
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
                return new Square(new ColorSupplier().getRandomColor(), new Random().nextInt(20));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
