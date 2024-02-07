package core.basesyntax;

import core.basesyntax.service.ColorSupplier;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        AbstractFigure[] figures = new AbstractFigure[3];

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (AbstractFigure figure : figures) {
            figure.draw();
        }
    }
}
