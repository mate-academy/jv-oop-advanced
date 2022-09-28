package core.basesyntax.utils;

import core.basesyntax.abstraction.Figure;
import core.basesyntax.figures.Circle;

import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random) {
        this.random = random;
        this.colorSupplier = new ColorSupplier(random);
    }
    public Figure getRandomFigure() {
        // random integer in length of number of BallColor
        // values
        int randomInt = random.nextInt(Figures.values().length);
        return Figures.values()[randomInt].getFigure(random, colorSupplier);
    }
    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.label, 10);
    }
}
