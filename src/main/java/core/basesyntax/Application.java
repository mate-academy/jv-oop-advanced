package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 1; i < figures.length; i++) {
            if (i <= 3) {
                figureSupplier.getRandomFigure();
            } else {
                figureSupplier.getDefaultFigure();
            }
        }
    }
}
