package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[6];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = figureSupplier.getRandomFigure();
        }
        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = figureSupplier.getDefaultFigure();
        }
        System.out.println(Arrays.toString(array));
    }
}
