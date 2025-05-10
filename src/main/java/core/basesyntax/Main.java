package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        FigureSupplier figureSupplier = new FigureSupplier();
        int middle = figures.length / 2;
        for (int i = 0; i < middle; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = middle; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

