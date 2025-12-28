package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int i = random.nextInt(3);

        switch (i) {
            case 0:
                return new Circle(1 + random.nextInt(10), colorSupplier.getRandomColor());
            case 1:
                return new Square(1 + random.nextInt(10), colorSupplier.getRandomColor());
            default:
                return new Rectangle(1 + random.nextInt(10), 1 + random.nextInt(10),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
