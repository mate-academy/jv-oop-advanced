package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        Figure[] figureArray = new Figure[random.nextInt(5)];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
            figureArray[i].draw();
        }
    }
}
