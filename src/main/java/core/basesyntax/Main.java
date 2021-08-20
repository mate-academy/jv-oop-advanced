package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_FIGURE_OUTPUT = 5;

    public static void main(String[] args) {
        int arrayLength = new Random().nextInt(MAX_FIGURE_OUTPUT);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[arrayLength];
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.hetRandomFigure();
            figuresArray[i].displayInfo();
        }
    }
}
