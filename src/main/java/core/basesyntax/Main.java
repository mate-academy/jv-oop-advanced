package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        int number = new Random().nextInt(5);
        for (int i = 0; i < number; i++) {
            System.out.println(fs.getRandomFigure().draw());
        }
    }
}
