package core.basesyntax;

import java.util.Random;

public class ProgramMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(100)];
        FigureSupplier createFigure = new FigureSupplier();
        for (int J = 0; J < figures.length; J++) {
            figures[J] = createFigure.getRandomFigure();
            figures[J].draw();
        }
    }
}
