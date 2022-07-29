package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSuplier color = new ColorSuplier();

    public Figure getRandomFigure() {

        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}

