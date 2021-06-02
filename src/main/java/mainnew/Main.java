package mainnew;

import behavior.Figure;
import behavior.FigureSupplier;

import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Main main = new Main();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = main.getRandomFigureArray();
        main.printFiguresArray(figures);

    }

    public Figure[] getRandomFigureArray() {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(NUMBER_OF_FIGURES)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        return figures;
    }

    public void printFiguresArray(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }
    }
}
