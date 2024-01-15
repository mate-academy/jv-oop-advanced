package core.basesyntax;

public class Application {
    private static final int OUTPUT_FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[OUTPUT_FIGURE_AMOUNT];
        for (int i = 0; i < OUTPUT_FIGURE_AMOUNT; i += 2) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
            figure[i + 1] = figureSupplier.getDefaultFigure();
            figure[i + 1].draw();
        }
    }
}
