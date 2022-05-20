package core.basesyntax;

import core.basesyntax.models.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
