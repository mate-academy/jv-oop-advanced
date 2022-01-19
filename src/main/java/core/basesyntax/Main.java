package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figureArray;
        Random myRandom = new Random();
        figureArray = new Figure[myRandom.nextInt(10) + 1];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure value: figureArray) {
            value.draw();
        }
    }
}
