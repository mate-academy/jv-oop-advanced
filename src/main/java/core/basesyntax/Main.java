package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int CO = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[CO];
        for (int i = 0; i < (figures.length / 2); i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + 3] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            figures[i + 3].draw();
        }
    }
}
