package core.basesyntax;

import java.util.Random;

public class ProgramMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(100)];
        FigureSupplier createFigure = new FigureSupplier();
        for (int j = 0; j < figures.length; j++) {
            figures[j] = createFigure.getRandomFigure();
            figures[j].draw();
        }
    }
}
