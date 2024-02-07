package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES_IN_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES_IN_ARRAY];

        for (int i = 0; i < NUMBER_OF_FIGURES_IN_ARRAY; i++) {
            if (i < (NUMBER_OF_FIGURES_IN_ARRAY + 1) / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println("Figure: " + figure.draw());
        }
    }
}
