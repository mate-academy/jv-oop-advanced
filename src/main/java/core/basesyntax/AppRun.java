package core.basesyntax;

import java.util.Random;

public class AppRun {
    public static void main(String [] arg) {
        FigureSupplier figSup = new FigureSupplier();
        Figure [] figure = new Figure[new Random().nextInt(4) + 3];
        for (int i = 0; i < figure.length; i++) {
            figure [i] = (i < 3) ? figSup.getRandomFigure() : figSup.getDefaultFigure();
        }
        for (Figure fig: figure) {
            fig.getInfo();
        }

    }
}
