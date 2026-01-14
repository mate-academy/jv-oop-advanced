package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int MAX_LENGHT = 6;
    public static final int HALF_LENGHT = 2;

    public static void main(String[] args) {
        Random random = new Random();
        Colors color = Colors.values()[random.nextInt(Colors.values().length)];
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_LENGHT];
        for (int i = 0; i < figures.length; i++) {
            Figure figure = supplier.getRandomFigure();
            Figure defaultFigure = supplier.getDefaultFigure();
            if (i < figures.length / HALF_LENGHT) {
                figures[i] = figure;
            } else {
                figures[i] = defaultFigure;
            }
        }
        for (Figure figure : figures) {
            figure.print();
        }
    }
}

