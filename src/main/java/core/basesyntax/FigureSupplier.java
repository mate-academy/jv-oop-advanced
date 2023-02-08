package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random;
    private ColorSupplier colorSupplier;

    FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        Figure[] list = new Figure[5];
        list[0] = new Circle(colorSupplier.getRandomColor(), random.nextDouble());
        list[1] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
        list[2] = new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
        list[3] = new Square(colorSupplier.getRandomColor(), random.nextDouble());
        list[4] = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
        return list[random.nextInt(list.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10.0);
    }
}
