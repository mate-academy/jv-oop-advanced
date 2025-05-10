package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.utiles.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int countFigures = random.nextInt(10) + 1;

        Figure[]filledArrayRndFigure = new Figure[countFigures];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < filledArrayRndFigure.length; i++) {
            filledArrayRndFigure[i] = figureSupplier.getRandomFigure();
            filledArrayRndFigure[i].printInfoFigure();
        }
    }
}
