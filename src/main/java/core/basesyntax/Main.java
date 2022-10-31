package core.basesyntax;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0, j = FIGURES_NUMBER - 1; i < (FIGURES_NUMBER / 2); i++, j--) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[j] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
