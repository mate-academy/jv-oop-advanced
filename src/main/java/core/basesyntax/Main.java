package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.supplier.FigureSupplier;
import java.util.Random;

public class Main {
    public static final int ARRAY_SIZE = 6;
    private static Random rnd = new Random();
    private static Figure[] figures = new Figure[ARRAY_SIZE];

    public static Random getRnd() {
        return rnd;
    }

    public static void setRnd(Random rnd) {
        Main.rnd = rnd;
    }

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.draw();
        }
    }

    public static Figure[] getFigures() {
        return figures;
    }

    public static void setFigures(Figure[] figures) {
        Main.figures = figures;
    }
}
