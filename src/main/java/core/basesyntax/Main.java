package core.basesyntax;

public class Main {
    private final static int FIGURE_COUNT = 6;
    public static void main(String[] args) {
        Figure[] figure = new Figure[FIGURE_COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
                figure[i].draw();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
                figure[i].draw();
            }
        }
    }
}
