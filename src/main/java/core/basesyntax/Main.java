package core.basesyntax;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figures[] array = new Figures[6];

        FigureSupplier figureSupplier = new FigureSupplier();

        array[0] = figureSupplier.getDefaultFigure();
        array[1] = figureSupplier.getRandomFigure();
        array[2] = figureSupplier.getRandomFigure();
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);




    }
}
