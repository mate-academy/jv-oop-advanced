package core.basesyntax;

import core.basesyntax.figures.AbstractFigure;
import java.util.Random;

public class Main {
    private static final int FROM = 0;
    private static final int TO = 6;
    private static final int FIRST_HALF = TO / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier(), new Random());
        for (int i = FROM; i < TO; i++) {
            AbstractFigure abstractFigure = i < FIRST_HALF
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            abstractFigure.draw();
        }
    }
}
