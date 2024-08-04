package core.basesyntax;

import core.basesyntax.figures.Drawable;
import core.basesyntax.service.FigureSupplier;
import java.util.Arrays;

public class Main {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] drawables = getDrawables(figureSupplier);
        Arrays.stream(drawables)
                .forEach(Drawable::draw);
    }

    private static Drawable[] getDrawables(FigureSupplier figureSupplier) {
        Drawable[] drawables = new Drawable[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            drawables[i] = i < ARRAY_LENGTH / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        return drawables;
    }
}
