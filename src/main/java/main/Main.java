package main;

import core.basesyntax.Figure;
import java.util.ArrayList;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            figures.add(figureSupplier.getRandomFigure());
        }

        for (Figure figure : figures) {
            figure.draw();
        }

        System.out.println("---Default figure---");

        figureSupplier.getDefaultFigure().draw();
    }
}
