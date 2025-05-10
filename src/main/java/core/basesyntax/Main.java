package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        int masSize = new Random().nextInt(25);
        Figure [] myFigures = new Figure[masSize];

        for (int i = 0; i < masSize / 2; i++) {
            myFigures[i] = figureSupplier.getRandomFigure();
        }

        Figure otherFigure = figureSupplier.getDefaultFigure();
        for (int i = masSize / 2; i < myFigures.length; i++) {
            myFigures[i] = otherFigure;
        }

        for (Figure myFigure : myFigures) {
            myFigure.draw();
        }
    }
}
