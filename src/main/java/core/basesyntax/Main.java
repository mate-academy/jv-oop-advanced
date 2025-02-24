package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[3];

        for (int i = 0; i < figures.length - 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
