package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int Figures_Count = 8;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[Figures_Count];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRundomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
