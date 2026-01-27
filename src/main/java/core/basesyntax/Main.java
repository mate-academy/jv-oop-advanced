package core.basesyntax;

public class Main {
    private static final int FIGURES_COUNT = 6;

    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        AbstractFigure[] figures = new AbstractFigure[FIGURES_COUNT];

        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (i < FIGURES_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].setColor(colorSupplier.getRandomColor());
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
