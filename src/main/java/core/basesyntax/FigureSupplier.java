package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure figure = new Circle();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        figure.setColor(colorSupplier.getRandomColor());
    }

    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR  = String.valueOf(Color.WHITE);
    private Figure defaultFigure = new Circle();

    public Figure getDefaultFigure(){
        defaultFigure.setColor(DEFAULT_COLOR);
    }
}
