package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < (random.nextInt(20) + 1); i++) {
            figureList.add(figureSupplier.getRandomFigure());
        }
        for (Figure figure : figureList) {
            figure.printFigure();
        }
    }
}
