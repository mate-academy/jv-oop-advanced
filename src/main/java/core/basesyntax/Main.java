package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int FL = 6;
        Figure[] figures = new Figure[FL];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2 - 1) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }

    }
}
