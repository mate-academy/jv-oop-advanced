package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
Figure[] figures = new Figure[6];
FigureSupplier figureSupplier = new FigureSupplier();
for (int i = 0; i < 6; i++) {
    if (i < 3) {
        figureSupplier.getRandomFigure().printSquareInfo();
    }
    else {
        figureSupplier.getDefaultFigure().printSquareInfo();
    }
    System.out.println("");
}
    }
}
