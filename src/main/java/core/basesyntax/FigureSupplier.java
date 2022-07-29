package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random randomFigure = new Random();
        switch (randomFigure.nextInt(5)) {
            case (0):
                return new Circle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(25));
            case (1):
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(25),
                        new Random().nextInt(25),
                        new Random().nextInt(25));
            case (2):
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(25),
                        new Random().nextInt(25));
            case (3):
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(25),
                        new Random().nextInt(25));
            case (4):
                return new Square(new ColorSupplier().getRandomColor(),
                        new Random().nextInt(25));
            default:
                getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), 10);
    }
}
