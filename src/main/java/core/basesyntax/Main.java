package core.basesyntax;

public class Main {
    private static final int ARRAYS_FIGURE_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figure = new Figure[ARRAYS_FIGURE_LENGTH];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = supplier.getRandomFigure();
                figure[i].draw();
            } else {
                figure[i] = supplier.getDefaultFigure();
                figure[i].draw();
            }
        }
    }
}
