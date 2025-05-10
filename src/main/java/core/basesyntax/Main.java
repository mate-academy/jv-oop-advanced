
import core.basesyntax.AbstractFigure;
import core.basesyntax.FigureSupplier;

public class Main {
    private static final int COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 2 * COUNT; i++) {
            AbstractFigure currentFigure;
            if (i < COUNT) {
                currentFigure = figureSupplier.getRandomFigure();
            } else {
                currentFigure = figureSupplier.getDefaultFigure();
            }
            currentFigure.draw();
        }
    }
}
