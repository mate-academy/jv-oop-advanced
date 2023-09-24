package core.basesyntax;

import core.basesyntax.figureFilling.FigureSupplier;
import core.basesyntax.figures.behaviour.Figure;

import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class GeneratingRandomFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        //half figures all random
        int half = figures.length / 2;
        for (int i = 0; i < half; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }

        System.out.println();
        //others are default
        for (int i = half; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            System.out.println(figures[i].draw());
        }
    }
}
