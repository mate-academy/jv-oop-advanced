package core.basesyntax;

public class Main {
    private static final int FIGURES_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[FIGURES_LENGTH];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures [i] = figureSupplier.getRandomFigure(figureSupplier.getRandomFigureType());
            } else {
                figures [i] = figureSupplier.getDefaultFigure();
            }
            System.out.println(figures[i].draw());
        }
    }
}
