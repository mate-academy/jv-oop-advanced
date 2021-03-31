package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] newFigure = buildNewFigure();
        show(newFigure);
        
    }

    private static Figure[] buildNewFigure() {
        FigureSupplier supplier = new FigureSupplier();
        int size = (int) (new Random().nextInt(5));
        Figure[] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = supplier.createRandomFigure();
        }
        return figures;
    }

    private static void show(Figure[] newFigure) {
        for (Figure figure : newFigure) {
            figure.drawerFigure();
        }
    }
}
