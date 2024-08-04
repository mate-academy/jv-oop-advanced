package core.basesyntax;

import core.basesyntax.figures.Drawable;
import core.basesyntax.service.FigureSupplier;

import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int arrayLength = 10;
        Drawable[] drawables = getDrawables(figureSupplier, arrayLength);
        Arrays.stream(drawables)
                .forEach(Drawable::draw);
    }

    private static Drawable[] getDrawables(FigureSupplier figureSupplier, int arrayLength) {
        Drawable[] drawables = new Drawable[arrayLength];
        for (int i = 0; i < arrayLength / 2; i++) {
            drawables[i] = figureSupplier.getRandomFigure();
        }
        for (int i = arrayLength / 2; i < arrayLength; i++) {
            drawables[i] = figureSupplier.getDefaultFigure();
        }
        return drawables;
    }
}
