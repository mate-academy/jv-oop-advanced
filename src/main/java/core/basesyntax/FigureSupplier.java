package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure[]array = new Figure[5];

    public Random getRandom() {
        return random;
    }

    public Figure[] getArray() {
        return array;
    }

    public Figure getRandomFigure() {
        getArray() [0] = new Circle(new ColorSupplier().getRandomColor(), getRandom().nextInt(10));
        getArray() [1] = new Rectangle(new ColorSupplier().getRandomColor(),
                getRandom().nextInt(10), random.nextInt(10));
        getArray() [2] = new Square(new ColorSupplier().getRandomColor(),
                getRandom().nextInt(10));
        getArray() [3] = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                getRandom().nextInt(10), random.nextInt(10),random.nextInt(10));
        getArray() [4] = new RightTriangle(new ColorSupplier().getRandomColor(),
                getRandom().nextInt(10), getRandom().nextInt(10));
        return getArray()[getRandom().nextInt(5)];
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE",10);
    }
}
