package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(5) + 1];
        for (Figure figure: figures) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            randomFigure.draw();
        }
    }
}
