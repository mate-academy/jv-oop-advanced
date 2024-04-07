package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            Figure figure;
            if (i < figures.length / 2) {
                figure = figureSupplier.getRandomFigure();
            } else {
                figure = figureSupplier.getDefaultFigure();
            }
            figures[i] = figure;
            figure.draw();
        }
    }
}
