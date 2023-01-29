package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figure.values().length);
        // FigureForm figureForm = new FigureForm();
        Figure figure = Figure.values()[index];
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = Figure.Circle;
        return figure;
    }
}
