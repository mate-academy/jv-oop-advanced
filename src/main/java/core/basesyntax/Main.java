package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figures.add(figure);
        }
        for (int i = 0; i < 3; i++) {
            Figure figure = figureSupplier.getDefaultFigure();
            figures.add(figure);
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
