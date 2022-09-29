package core.basesyntax;

import java.util.Random;

public class Application {
    public static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(new Random()));
        Figure randomFigure = figureSupplier.getRandomFigure();
        Figure[] figures = new Figure[FIGURES_AMOUNT];
        figures[0] = randomFigure;
        figures[1] = randomFigure;
        figures[2] = randomFigure;
        figures[3] = figureSupplier.getDefaultFigure();
        figures[4] = figureSupplier.getDefaultFigure();
        figures[5] = figureSupplier.getDefaultFigure();
        System.out.println(figures);
//        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(new Random()));
//        System.out.println(figureSupplier.getDefaultFigure());


    }
}
