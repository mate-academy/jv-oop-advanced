package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static final int FIGURES_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_ARRAY_LENGTH];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length - 1; i != figures.length / 2 - 1; i--) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
