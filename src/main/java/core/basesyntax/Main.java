package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    FigureSupplier figureSupplier = new FigureSupplier();
    String[] figureArray = new String[3];
    figureArray[0] = figureSupplier.getDefaultFigure().getDraw();
    figureArray[1] = figureSupplier.getRandomFigure().getDraw();
    figureArray[2] = figureSupplier.getRandomFigure().getDraw();
    for (int i = 0; i < figureArray.length; i++) {
        System.out.println(figureArray[i]);
    }
    }
}
