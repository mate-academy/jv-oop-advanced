package core.basesyntax;

public class Main {
    private static final int FIGURES_LIMIT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_LIMIT];
        for (int i = 0; i < FIGURES_LIMIT; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
