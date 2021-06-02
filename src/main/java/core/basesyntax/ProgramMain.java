package core.basesyntax;

import java.util.Random;

public class ProgramMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(100)];

        for (int J = 0; J < figures.length; J++) {
            figures[J] = FigureSupplier.getRandomFigure();
            figures[J].draw();
        }
    }
}
