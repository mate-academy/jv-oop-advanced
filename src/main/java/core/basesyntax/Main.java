package core.basesyntax;

public class Main {
    private static final int FIGURES_BOUND = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_BOUND];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
