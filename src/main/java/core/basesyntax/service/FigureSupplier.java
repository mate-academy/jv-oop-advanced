package core.basesyntax.service;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {
    public static final int MAXIMUM_RADIUS = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        /** generate a specific figure based on the `figureNumber` value*/
        Figure figure = null;
        return figure;
    }

    public Figure getDefaultFigure() {
        //return white circle with radius 10
        return new Circle(Color.WHITE, 10);
    }
}
