package core.basesyntax.arraygenerator;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.figuresuppliers.FigureSupplier;
import java.util.Random;

public class FigureArrayGenerator {
    private static final int ARRAY_SIZE = 6;
    private static final int FIGURE_COUNT = 5;
    private final FigureSupplier figureSupplier = new FigureSupplier();
    private final Random random = new Random();

    public Figure[] generateArray() {
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(generateIndex());
        }
        for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefualtFigure();
        }
        return figures;
    }

    private int generateIndex() {
        return random.nextInt(FIGURE_COUNT);
    }
}
