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
        FigureSupplier figSup = new FigureSupplier();
        ColorSupplier randColor = new ColorSupplier();

        for (int i = 0; i < figArr.length; i++) {
            do {
                figArr[i] = figSup.randFigureProper();
            } while (figArr[i] == null);
            randColor.generateColor(figArr[i]);
        }
    }

    public static void showFigureArray(Figure[] figArr) {
        for (Figure fig: figArr) {
            fig.drawFigure();
        }
    }
}
