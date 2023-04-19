package core.basesyntax.arraygenerator;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.figuresuppliers.DefaultFigureSupplier;
import core.basesyntax.suppliers.figuresuppliers.RandomFigureSupplier;
import core.basesyntax.suppliers.shapesuppliers.RandomShapeSupplier;

public class FigureArrayGenerator {
    private final int arraySize;
    private final RandomShapeSupplier shapeSupplier = new RandomShapeSupplier();
    private final RandomFigureSupplier randomFigureSupplier;
    private final DefaultFigureSupplier defaultFigureSupplier;

    public FigureArrayGenerator(int arraySize,
                                RandomFigureSupplier randomFigureSupplier,
                                DefaultFigureSupplier defaultFigureSupplier) {
        this.arraySize = arraySize;
        this.randomFigureSupplier = randomFigureSupplier;
        this.defaultFigureSupplier = defaultFigureSupplier;
    }

    public Figure[] generateArray() {
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = randomFigureSupplier.getRandomFigure(shapeSupplier.getRandomShape());
        }
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = defaultFigureSupplier.getDefualtFigure();
        }
        return figures;
    }
}
