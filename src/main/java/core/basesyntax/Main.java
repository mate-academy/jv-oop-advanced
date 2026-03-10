package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int size = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figures[] figure = new Figures[size];
        figure[0] = figureSupplier.getRandomFigure();
        figure[1] = figureSupplier.getRandomFigure();
        figure[2] = figureSupplier.getRandomFigure();
        figure[3] = figureSupplier.getDefaultFigure();
        figure[4] = figureSupplier.getDefaultFigure();
        figure[5] = figureSupplier.getDefaultFigure();

        for (int i = 0; i < size; i++) {
            figure[i].draw();
        }
    }
}
