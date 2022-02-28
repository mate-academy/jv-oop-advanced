package core.basesyntax.model;

import java.util.Random;

/**
 * @version 1.0
 * @autor shd
 * @created by 28/02/2022 - 12:44
 * @project jv-oop-advanced
 */
public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = {
                new Triangle("Tri", 40, colorSupplier.getRandomColor(), 8, 5),
                new Circle("Circle", 25.5, colorSupplier.getRandomColor(), 5),
                new Square("Square", 169, colorSupplier.getRandomColor(), 13)};
        return figures[new Random().nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle("CircleDef", 25.0, Color.WHITE,5);
    }
}
