package core.basesyntax;

public class Main {
    private static final int AMOUNT_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[AMOUNT_FIGURE];
        for (int i = 0; i < figures.length; i++) {
            if (i == figures.length / 2) {
                figures[i] = figureSupplier.getDefaultCircle();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
