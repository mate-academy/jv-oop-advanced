package core.basesyntax;

public class Main {
    public static final int FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_AMOUNT];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < (figures.length / 2))
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
