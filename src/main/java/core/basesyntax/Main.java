package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        int figuresAmount = random.nextInt(FigureSupplier.FIGURE_COUNT);
        Figure[] figures = new Figure[figuresAmount];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].printInfo();
        }
    }
}
