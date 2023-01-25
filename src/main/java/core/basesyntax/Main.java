package core.basesyntax;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figures = new Figure[6];

        for (int i = 0; i < (figures.length / 2); i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        figureSupplier.getDefaultFigure().draw();
        figureSupplier.getDefaultFigure().draw();
        figureSupplier.getDefaultFigure().draw();


    }
}
