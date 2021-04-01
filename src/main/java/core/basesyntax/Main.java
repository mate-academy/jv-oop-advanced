package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_LENGTH = 20;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        int arrayNum = random.nextInt(MAX_LENGTH);
        Figure[] arrOfFigures = new Figure[arrayNum];
        for (int i = 0; i < arrOfFigures.length; i++) {
            arrOfFigures[i] = figureSupplier.getFigure();
            arrOfFigures[i].drawFigure();
        }
    }
}
