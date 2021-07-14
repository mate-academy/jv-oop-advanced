package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        int figureNumber = new Random().nextInt(NUMBER_OF_FIGURES);
        Figure[] figuresArray = new Figure[figureNumber];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
