package core.basesyntax;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {

        final Figure[] figures = new Figure[new Random().nextInt(3, 6)];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int j = figures.length / 2; j < figures.length; j++) {
            figures[j] = new FigureSupplier().getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.info());
        }
    }

}
