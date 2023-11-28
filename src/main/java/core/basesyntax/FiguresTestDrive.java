package core.basesyntax;

import core.basesyntax.model.Figure;
import java.util.Random;

public class FiguresTestDrive {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[new Random().nextInt(5)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}

