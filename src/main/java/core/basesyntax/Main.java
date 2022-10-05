package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FN = 6;
        Figure []figures = new Figure[FN];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].drawFigure();
            }
        }
    }
}
