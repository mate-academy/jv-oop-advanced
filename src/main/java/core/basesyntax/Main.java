package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figure = new Figure[random.nextInt(5)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].getInfo();
        }
    }
}
