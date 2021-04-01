package core.basesyntax;

import java.util.Random;

public class Main {
   public static void main(String[] args) {
        final int MAX_NUMBER = 10;
        int figuresNumber = new Random().nextInt(MAX_NUMBER);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresList = new Figure[figuresNumber];

        for (int i = 0; i < figuresNumber; i++) {
            figuresList[i] = figureSupplier.getRandomFigure();
            System.out.print(i + 1 + ". ");
            figuresList[i].draw();
        }
    }
}
