package core.basesyntax;

import java.util.Random;

public class MainApp {
    public static final double FIGURES_COUNT = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
