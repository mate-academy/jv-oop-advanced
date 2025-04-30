package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import core.basesyntax.suppliers.FigureSupplier;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();

        Figure[] figuresArray = new Figure[6];

        for (int figuresCounter = 0; figuresCounter < 3; figuresCounter++) {
            figuresArray[figuresCounter] = figureSupplier.getRandomFigure();
            colorSupplier.setRandomColor(figuresArray[figuresCounter]);
        }

        for (int figuresCounter = 3; figuresCounter < 6; figuresCounter++) {
            figuresArray[figuresCounter] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
