package org.denys.oop.advanced;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figureList;
        figureList = new ArrayList<>(List.of(
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getRandomFigure(),
                FigureSupplier.getDefaultFigure()));

        for (Figure figure : figureList) {
            figure.drawFigure();
        }
    }

}
