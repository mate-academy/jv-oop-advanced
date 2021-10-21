package core.basesyntax;

import static core.basesyntax.FigureSupplier.getDefaultFigure;
import static core.basesyntax.FigureSupplier.getRandomFigure;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = new Figure [] { getRandomFigure(), getRandomFigure(), getRandomFigure(),
                getDefaultFigure(), getRandomFigure(), getRandomFigure() };

        for (int i = 0; i < figures.length; i++) {
            figures[i].printInfo();
        }
    }
}
