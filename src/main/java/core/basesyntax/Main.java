package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.Square;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        figures[0] = FIGURE_SUPPLIER.getRandomFigure();
        figures[1] = FIGURE_SUPPLIER.getRandomFigure();
        figures[2] = FIGURE_SUPPLIER.getRandomFigure();
        figures[3] = new Circle("WHITE", 6);
        figures[4] = new Square("RED", 4);
        figures[5] = new Rectangle("GREEN", 5, 5);

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
