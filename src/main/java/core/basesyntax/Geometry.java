package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

public class Geometry {

    public static void main(String[] args) {
        final int maxNumberOfFiguresToGenerate = 20;
        Random random = new Random();
        int numberOfFigures = random.nextInt(maxNumberOfFiguresToGenerate) + 1;
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
