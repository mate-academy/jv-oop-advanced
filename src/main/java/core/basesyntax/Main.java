package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Figure[] array = new Figure[5];
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = new FigureSupplier().getRandomFigure(new Random().nextInt(5));
            array[i].draw();
        }
        for (int j = array.length / 2; j < array.length; j++) {
            new FigureSupplier().getDefaultFigure().draw();
        }
        System.out.println();
    }
}
