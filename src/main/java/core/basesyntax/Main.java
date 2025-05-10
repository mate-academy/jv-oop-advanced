package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random, new ColorSupplier(random));
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures.add(i, figureSupplier.getRandomFigure());
            } else {
                figures.add(i, figureSupplier.getDefaultFigure());
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
