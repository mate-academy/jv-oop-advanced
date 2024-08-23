package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int value = random.nextInt(4);

        switch (value) {
            case 0: {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(), random.nextInt(),
                        random.nextInt());
            }
            case 1: {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt());
            }
            case 2: {
                return  new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(), random.nextInt());
            }
            case 3: {
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(), random.nextInt());
            }
            default: {
                return new Square(colorSupplier.getRandomColor(), random.nextInt());
            }
        }
    }
}
