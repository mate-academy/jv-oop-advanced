package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final int MAX_FIGURES_IN_LIST = 20;
    public static final int MIN_FIGURES_IN_LIST = 1;

    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < (random.nextInt(MAX_FIGURES_IN_LIST) + MIN_FIGURES_IN_LIST); i++) {
            figureList.add(figureSupplier.getRandomFigure());
            figureList.get(i).draw();
        }
    }
}
