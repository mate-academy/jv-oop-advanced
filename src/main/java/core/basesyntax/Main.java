package core.basesyntax;

import core.basesyntax.model.state.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = create();
        show(figures);
    }

    private static Figure[] create() {
        int size = (int) (Math.random() * 25);
        Figure[] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.generateFigure();
        }
        return figures;
    }

    private static void show(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
