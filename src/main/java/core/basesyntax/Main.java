package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        final int figureNumbers = 6;

        Figure[] figures = new Figure[figureNumbers];

        for (int i = 0; i < figures.length; i++) {
            if (i >= figureNumbers / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
