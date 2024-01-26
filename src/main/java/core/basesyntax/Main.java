package core.basesyntax;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < FIGURES_NUMBER / 2) ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
