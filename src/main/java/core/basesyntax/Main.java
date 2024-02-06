package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.service.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            System.out.println(figure[i]);
        }
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] == null) {
                figure[i] = figureSupplier.getDefaultFigure();
                System.out.println(figure[i]);
            }
        }
    }
}
