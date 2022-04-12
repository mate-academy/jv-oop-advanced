package core.basesyntax.Supplier;

import core.basesyntax.Figure.Circle;
import core.basesyntax.Figure.Figure;
import core.basesyntax.Figure.Square;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int side = random.nextInt(MAX_VALUE);
        return new Square(color, side);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
