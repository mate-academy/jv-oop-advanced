package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        Arrays.fill(figures, 3, 6, figureSupplier.getDefaultFigure());
        for (Figure figure: figures) {
            System.out.println(figure.draw());
        }
    }
}
