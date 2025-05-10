package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(10000) + 1;
        Figure[] figArray = new Figure[num];
        fillArray(figArray);
        showFigureArray(figArray);
    }

    public static void fillArray(Figure[] figArr) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figArr.length; i++) {
            do {
                figArr[i] = figureSupplier.getRandomFigure();
            } while (figArr[i] == null);
        }
    }

    public static void showFigureArray(Figure[] figArr) {
        for (Figure fig: figArr) {
            fig.drawFigure();
        }
    }
}
