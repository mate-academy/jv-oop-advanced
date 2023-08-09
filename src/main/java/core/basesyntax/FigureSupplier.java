package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        return new Circle(3, "black");
    }

    public Figure getDefoltFigure() {
        return new Circle(10, ColorSupplier.Color.WHITE.name());
    }
}
