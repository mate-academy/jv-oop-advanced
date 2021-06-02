package core.basesyntax;

import java.util.Random;

public class Main {

    private static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        int getRandomInt = new Random().nextInt(NUMBER_OF_FIGURES);
        Figure[] figuresArray = new Figure[getRandomInt];
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = new FigureSupplier().getRandomFigure();
            figuresArray[i].draw();
        }
    }
}
