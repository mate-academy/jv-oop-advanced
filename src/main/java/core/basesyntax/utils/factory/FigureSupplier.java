package core.basesyntax.utils.factory;

import core.basesyntax.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_ARRAY_SIZE = 40;
    private final FigureFactory factory = new FigureFactory();

    public Figure[] generateRandomFigures() {
        int figuresArrayRandomLength = new Random().nextInt(MAX_ARRAY_SIZE);
        Figure[] figures = new Figure[figuresArrayRandomLength];
        int randomIndex = new Random().nextInt(FigureTypes.values().length);

        for (int i = 0; i < figures.length; i++) {
            figures[i] = factory.getFigure(FigureTypes.values()[randomIndex]);
        }
        return figures;
    }
}

