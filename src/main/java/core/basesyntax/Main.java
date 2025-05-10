package core.basesyntax;

public class Main {
    static final int COUNT_OF_FIGURES = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[COUNT_OF_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            if (i < COUNT_OF_FIGURES / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}

