package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(1000)];
        for (Figure figure: figures) {
            figureSupplier.getRandomFigure();
        }
    }
}
