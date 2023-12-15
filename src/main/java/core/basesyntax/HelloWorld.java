package core.basesyntax;

import core.basesyntax.figures.Drawable;
import core.basesyntax.utils.FigureSupplier;

public class HelloWorld {
    private static final int DRAWABLE_COUNT = 10;

    public static void main(String[] args) {
        Drawable[] drawables = generateDrawables();

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    private static Drawable[] generateDrawables() {
        FigureSupplier figureSupplier = new FigureSupplier();
        Drawable[] drawables = new Drawable[DRAWABLE_COUNT];
        int i = 0;

        for (; i < DRAWABLE_COUNT / 2; i++) {
            drawables[i] = figureSupplier.getRandomFigure();
        }

        for (; i < DRAWABLE_COUNT; i++) {
            drawables[i] = figureSupplier.getDefaultFigure();
        }

        return drawables;
    }
}
