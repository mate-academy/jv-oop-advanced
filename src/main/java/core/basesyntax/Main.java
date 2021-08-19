package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomArray = new Random().nextInt(5);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] randomFigure = new Figure[randomArray];

        for (int i = 0; i <= randomFigure.length; i++) {
            randomFigure[i] = figureSupplier.getRandomFigure();
            randomFigure[i].drawFigure();
        }
    }
}
