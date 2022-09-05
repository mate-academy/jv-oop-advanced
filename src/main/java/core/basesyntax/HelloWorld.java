package core.basesyntax;

import core.basesyntax.model.Figure;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = FigureSupplier.getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
