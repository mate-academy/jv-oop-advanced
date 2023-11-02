package core.basesyntax;

import java.util.Random;

public class Application {

    private static final Figure[] figures = new Figure[new Random().nextInt(3, 6)];
    private static final FigureSupplier figure = new FigureSupplier();

    public static void main(String[] args) {

        for (int i = 0; i < figures.length / 2 + 1; i++) {
            figures[i] = figure.getRandomFigure();
        }
        for (int j = figures.length / 2; j < figures.length; j++) {
            figures[j] = figure.getDefaultFigure();
        }
        for (Figure figureShow : figures) {
            System.out.println(figureShow.info());
        }
    }

}
