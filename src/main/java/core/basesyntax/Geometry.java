package core.basesyntax;

import java.util.Random;

public class Geometry {

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfFigures = random.nextInt(19) + 1;
        Figure[] figures = new Figure[numberOfFigures];
        boolean writeDefault = false;
        for (int i = 0; i < figures.length; i++) {
            if (!writeDefault) {
                figures[i] = FigureSupplier.getRandomFigure();
                if (i >= figures.length / 2) {
                    writeDefault = true;
                }
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }

}
