package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int massiveSize = 6;
        Figure[] figures = new Figure[massiveSize];

        for (int i = 0; i < massiveSize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = massiveSize / 2; i < massiveSize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
