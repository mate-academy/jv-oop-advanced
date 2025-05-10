package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int figures = random.nextInt(10);
        Figure[] arrayOfFigures = new Figure[figures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures; i++) {
            arrayOfFigures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 0; i < figures; i++) {
            printInfo(arrayOfFigures[i]);
        }
    }

    public static void printInfo(Figure figure) {
        InfoBox ib = (InfoBox) figure;
        ib.draw();
    }
}
