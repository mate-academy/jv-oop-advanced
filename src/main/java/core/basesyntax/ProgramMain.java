package core.basesyntax;

import java.util.Random;

public class ProgramMain {
    private static final int UPPER_BOUND = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(MAXFIGURES)];
        FigureSupplier createFigure = new FigureSupplier();

        for (int j = 0; j < figures.length; j++) {
            figures[j] = createFigure.getRandomFigure();
            figures[j].draw();
        }
    }
}
