package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        FigureMain[] newFigure = new FigureMain[random.nextInt(50)];

        for (int i = 0; i < newFigure.length;i++) {
            newFigure[i] = FigureSupplier.getRandom();
        }
        for (FigureMain figure: newFigure) {
            figure.draw();
        }
    }
}
