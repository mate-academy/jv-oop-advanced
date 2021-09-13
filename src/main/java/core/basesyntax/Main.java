package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] FigureArray;
        Random myRandom = new Random();
        FigureArray = new Figure[myRandom.nextInt(10) + 1];
        for (int i = 0; i < FigureArray.length; i++) {
            FigureArray[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure value: FigureArray) {
            value.Draw();
        }
    }
}
