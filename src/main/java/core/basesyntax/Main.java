package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int random = new Random().nextInt(10);
        Figure [] figures = new Figure[random];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].toString());
        }
    }
}
