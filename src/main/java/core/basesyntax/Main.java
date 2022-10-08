package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[6];
        for (int i = 0; i < (figures.length); i = i + 2) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + 1] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            figures[i + 1].draw();
        }
    }
}
