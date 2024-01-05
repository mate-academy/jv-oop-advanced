package core.basesyntax;

public class Main {
    private static final int BOUND = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[BOUND];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < BOUND / 2) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
