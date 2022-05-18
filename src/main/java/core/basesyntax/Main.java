package core.basesyntax;

import core.basesyntax.suppliers.ColorSupplier;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random, new ColorSupplier());
        Figure[] figuresArray = new Figure[6];

        for (int i = 0; i < figuresArray.length; i++) {
            if (i < 3) {
                figuresArray[i] = figureSupplier.getRandomFigure();
                figuresArray[i].showInfo();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
                figuresArray[i].showInfo();
            }
        }
    }
}
