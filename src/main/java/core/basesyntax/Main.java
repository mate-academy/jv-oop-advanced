package core.basesyntax;

public class Main {
    private static final int COUNT_OF_FIGURES_IN_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_OF_FIGURES_IN_ARRAY];
        for (int i = 0; i < figures.length; i++) {
            if (i < COUNT_OF_FIGURES_IN_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

