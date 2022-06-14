package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] arrayOfFigures = {supplier.getRandomFigure(), supplier.getRandomFigure(), supplier.getRandomFigure(),
                                supplier.getDefaultFigure(), supplier.getDefaultFigure(), supplier.getDefaultFigure()};

        for (Figure figure : arrayOfFigures) {
            System.out.println(figure.toString());
        }
    }
}
