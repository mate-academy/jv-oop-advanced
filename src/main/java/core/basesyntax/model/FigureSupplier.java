package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = {
                new Triangle("Triangle", colorSupplier.getRandomColor(), 8, 5),
                new Circle("Circle", colorSupplier.getRandomColor(), 5),
                new Square("Square", colorSupplier.getRandomColor(), 13)};
        return figures[new Random().nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("CircleDefault", Color.WHITE, 7);
    }
}
