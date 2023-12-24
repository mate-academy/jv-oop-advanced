package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i > (figures.length / 2) ? figureSupplier.getDefaultFigure()
                    : figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
