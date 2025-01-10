package core.basesyntax;

import classes_inheritors.*;

public class FiguresApp {
    private static final int FIGURE_COUNT = 6;
    private static final int HALF_COUNT = FIGURE_COUNT / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[FIGURE_COUNT];
        for (int elementIndex = 0; elementIndex < FIGURE_COUNT; elementIndex++){
            if (elementIndex < HALF_COUNT) {
                figuresArray[elementIndex] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[elementIndex] = figureSupplier.getDefaultFigure();
            }
        }

        for(Figure figure : figuresArray) {
            System.out.println(figure.draw());
        }
    }
}
