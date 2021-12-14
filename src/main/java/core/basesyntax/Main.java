package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (int e = 0; e < figures.length / 2; e++) {
            figures[e] = figureSupplier.getRandomFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
