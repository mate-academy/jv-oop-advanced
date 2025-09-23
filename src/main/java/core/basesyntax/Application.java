package core.basesyntax;

public class Application {
    private static final int FIGURES_ARRAY_LENGTH = 4;
    
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_ARRAY_LENGTH];

        for (int i = 0; i < FIGURES_ARRAY_LENGTH; i++) {
            if (i >= (FIGURES_ARRAY_LENGTH / 2)) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
