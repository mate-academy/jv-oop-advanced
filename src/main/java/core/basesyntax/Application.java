package core.basesyntax;

import core.basesyntax.arraygenerator.FigureArrayGenerator;
import core.basesyntax.enums.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.painter.Painter;
import core.basesyntax.suppliers.figuresuppliers.DefaultFigureSupplier;
import core.basesyntax.suppliers.figuresuppliers.RandomFigureSupplier;

public class Application {
    public static void main(String[] args) {
        int min = 5;
        int max = 25;
        Color defualtColor = Color.WHITE;
        int defaultSideLength = 10;
        int figureArraySize = 8;
        RandomFigureSupplier randomFigureSupplier = new RandomFigureSupplier(min, max);
        DefaultFigureSupplier defaultFigureSupplier = new DefaultFigureSupplier(
                defualtColor, defaultSideLength);
        FigureArrayGenerator figureArrayGenerator = new FigureArrayGenerator(
                figureArraySize, randomFigureSupplier, defaultFigureSupplier);
        Painter painter = new Painter();
        Figure[] figures = figureArrayGenerator.generateArray();
        painter.drawFigures(figures);
    }
}
