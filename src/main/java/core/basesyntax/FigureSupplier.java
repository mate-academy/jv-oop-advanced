package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();
    private final TypeSupplier types = new TypeSupplier();

    public Figure getRandomFigure() {
        String type = types.getRandomType();
        if (type.equals("SQUARE")) {
            return new Square(color.getRandomColor(), random.nextInt(10) + 1);
        }
        if (type.equals("TRIANGLE")) {
            return new Triangle(color.getRandomColor(), random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
        } else {
            return new Circle(color.getRandomColor(), random.nextInt(10) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
