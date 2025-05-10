package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure:figures) {
            figure.draw();
        }
    }
}
