package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(1000)];
        for (Figure figure: figures) {
            figure = new FigureSupplier().get();
            System.out.println(figure);
        }
    }
}
