package core.basesyntax;

public class Main {
    static final int FIGURES_ARRAY_SIZE = 20;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_ARRAY_SIZE];
        for (int i = 0; i < FIGURES_ARRAY_SIZE; ++i) {
            System.out.print(i + ((i < 10) ? ".  " : ". "));
            figures[i] = (i < FIGURES_ARRAY_SIZE / 2)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].drawFigure();
        }
    }
}
