package core.basesyntax.model;

import suppliers.FigureSupplier;

import javax.swing.*;
import java.util.Random;

public class Hello {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
