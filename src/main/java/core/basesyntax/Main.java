package core.basesyntax;

import core.basesyntax.model.state.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = create();
        show(figures);
    }

    private static Figure[] create() {
        FigureSupplier figureSupplier = new FigureSupplier();
        int size = (int) (new Random().nextInt(25));
        Figure[] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.generateFigure();
        }
        return figures;
    }

    private static void show(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
