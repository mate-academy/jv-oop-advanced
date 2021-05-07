package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();  // list figures
        int manyFigures = 10;                       // number of figures
        for (int i = 0; i < manyFigures; i++) {
            figures.add(new FigureSupplier().getRandomFigure());
        }
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    public static int rnd(int n) {
        return new Random().nextInt(n);
    }

    public static int rnd(int begin, int end) {
        return begin + new Random().nextInt(end);
    }
}
