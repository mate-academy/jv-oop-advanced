package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberOfFigures = 3;

        // Filling figures
        for (int i = 0; i < numberOfFigures; i++) {
            if (i == numberOfFigures - 1) {
                figureList.add(figureSupplier.getDefaultFigure());
            } else {
                figureList.add(figureSupplier.getRandomFigure());
            }
        }

        // Calculating the area for each figure
        for (int i = 0; i < numberOfFigures; i++) {
            figureList.get(i).findArea();
        }

        // Drawing all the figures
        for (Figure figure: figureList) {
            System.out.println(figure.draw());
        }
    }
}
