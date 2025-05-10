package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int maxSizeArray = 6;
        Figure[] figures = new Figure[maxSizeArray];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure takeFigure : figures) {
            takeFigure.drowFigure();
        }
    }
}
