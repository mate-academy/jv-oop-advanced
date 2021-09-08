package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomArrayLength = new Random().nextInt(10) + 1;
        Figure[] randomFigureList = new Figure[randomArrayLength];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < randomFigureList.length; i++) {
            Figure newRandomFigure = figureSupplier.getRandomFigure();
            randomFigureList[i] = newRandomFigure;
        }

        for (Figure figure: randomFigureList) {
            figure.drawFigure();
        }
    }

}

