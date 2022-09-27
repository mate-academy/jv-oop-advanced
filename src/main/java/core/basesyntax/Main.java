package core.basesyntax;

import jdk.management.jfr.ConfigurationInfo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        List <Figure> figureList = new ArrayList<>();
        int numberOfFigures = 3;

        // Filling list of figures
       for (int i = 0; i < numberOfFigures; i++) {
           if (i == numberOfFigures - 1) {
               figureList.add(figureSupplier.getDefaultFigure());
           }
           else {
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
