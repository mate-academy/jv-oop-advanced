package core.basesyntax;

import java.util.Random;

public interface GetArray {
    default Figure[] getArray() {
        int length = new Random().nextInt(10);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] rez = new Figure[length];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = figureSupplier.getRandomFigure();
        }
        return rez;
    }
}
