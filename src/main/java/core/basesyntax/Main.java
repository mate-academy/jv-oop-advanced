package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random randomNumberOfFigures = new Random();
        Figure[] figureArray = new Figure[randomNumberOfFigures.nextInt(30)];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figureArray) {
            figure.draw();
        }
    }
}
