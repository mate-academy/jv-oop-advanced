package core.basesyntax;

import core.basesyntax.abstraction.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.utils.FigureSupplier;
import core.basesyntax.utils.Figures;

import java.util.Random;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;
    private static final int NUMBER_OF_GENERATED_FIGURES = 3;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random);
        Figure[] figures = new Figure[SIZE_OF_ARRAY];

        for (int i = 0; i < NUMBER_OF_GENERATED_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = NUMBER_OF_GENERATED_FIGURES; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
