package core.basesyntax;

import java.util.Random;

public class MainApp extends FigureSupplier {
    public static void main(String[] args) {
        Random r = new Random();
        int qf = r.nextInt(5) + 1;
        String[] array = new String[qf];
        for (int i = 0; i < array.length; i++) {
            System.out.println(getRandomFigure());
        }
    }
}
