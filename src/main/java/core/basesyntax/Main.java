package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int manyFigures = 10;

        for (int i = 0; i < manyFigures; ++i) {
            System.out.println(new FigureSupplier().getRandomFigure().toString());
        }
    }

    public static int rnd(int n) {
        return (new Random()).nextInt(n);
    }

    public static int rnd(int begin, int end) {
        return begin + (new Random()).nextInt(end);
    }
}
