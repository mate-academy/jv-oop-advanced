package core.basesyntax;

import static core.basesyntax.FigureSupplier.getRandomFigure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = getRandomFigure();
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
            for (Figure figure : figures) {
                if (figure != null) {
                    figure.draw();
                }
            }
        }
    }
}

