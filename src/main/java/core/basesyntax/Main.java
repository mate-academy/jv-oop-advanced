package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        getAndPrintFigure(figures);
    }

    private static void getAndPrintFigure(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureGenerate().get();
            figures[i].draw();
        }
    }
}
