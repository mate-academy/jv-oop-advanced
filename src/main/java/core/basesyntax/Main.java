package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure f : figures) {
            f.printInfo();
        }
    }
}
