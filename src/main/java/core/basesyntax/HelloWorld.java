package core.basesyntax;

import core.basesyntax.Model.Figures;
import core.basesyntax.Suppliers.FigureSupplier;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figures[] figures = new Figures[new Random().nextInt(5)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figures figure : figures) {
            figure.displayInfo();
        }
    }
}

