package core.basesyntax;

public class DrawFigure {

    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
            figure[i].draw();
        }
    }
}
