package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int number = new Random().nextInt(NUMBER_OF_FIGURES);
        for (int i = 0; i < number; i++) {
            System.out.println(figureSupplier.getRandomFigure().draw());
        }
    }
}
