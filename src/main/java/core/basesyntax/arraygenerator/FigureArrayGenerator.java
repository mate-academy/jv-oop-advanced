package core.basesyntax.arraygenerator;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.figuresuppliers.FigureSupplier;
import java.util.Random;

public class FigureArrayGenerator {
    private final int figureCount = 5;
    private final int arraySize = 6;
    private final FigureSupplier figureSupplier = new FigureSupplier();
    private final Random random = new Random();

    public Figure[] generateArray() {
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(generateIndex());
        }
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = figureSupplier.getDefualtFigure();
        }
        return figures;
    }

    private int generateIndex() {
        return random.nextInt(figureCount);
    }
}
