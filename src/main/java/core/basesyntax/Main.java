package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        List<Figure> arrayOfFigures = new ArrayList<>();
        Figure randomFigure = figureSupplier.getDefaultFigure();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                arrayOfFigures.add(i, figureSupplier.getRandomFigure());
            } else {
                arrayOfFigures.add(i, figureSupplier.getDefaultFigure());
            }
        }
        for (Figure figure : arrayOfFigures) {
            figure.draw();
        }

    }
}
