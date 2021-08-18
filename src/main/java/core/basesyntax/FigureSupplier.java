package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (new Random().nextInt(5)) {
            case (0):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10), random.nextInt(10));
            case (1):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt());
            case (2):
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            case (3):
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
        }
    }
}
