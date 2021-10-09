package core.basesyntax;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int ArraySize = 5;
        Random random = new Random();
        Figure[] figureArray = new Figure[random.nextInt(ArraySize) + 1];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figureArray) {
            figure.draw();
        }
    }
}
