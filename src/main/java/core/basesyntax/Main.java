package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static final int COUNT_FIGURES = 10;

    public static void main(String[] args) {
        Figure[] shapes = getShapes();
        for (Figure shape : shapes) {
            shape.draw();
        }
    }

    private static Figure[] getShapes() {
        Figure[] shapes = new Figure[new Random().nextInt(COUNT_FIGURES)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = figureSupplier.getRandomFigure();
        }
        return shapes;
    }
}

