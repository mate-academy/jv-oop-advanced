
import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class Main {
    private static final int COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 2 * COUNT; i++) {
            Figure currentFigure = (i < COUNT) ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
            currentFigure.draw();
        }
    }
}
