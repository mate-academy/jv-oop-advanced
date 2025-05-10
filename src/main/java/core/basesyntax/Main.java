package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();
        Figure [] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i > figures.length / 2 - 1) {
                figures[i] = defaultFigure;
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
