package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberOfFigures = 6;

        // Filling figures
        for (int i = 0; i < numberOfFigures; i++) {
            if (i < numberOfFigures / 2) {
                figureList.add(figureSupplier.getDefaultFigure());
            } else {
                figureList.add(figureSupplier.getRandomFigure());
            }
        }

        // Drawing all the figures
        for (Figure figure: figureList) {
            System.out.println(figure.draw());
        }
    }
}
