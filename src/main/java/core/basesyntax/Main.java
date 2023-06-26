package core.basesyntax;

public class Main {
    public static final int SIZE_ARR = 6;

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figures = new Figure[SIZE_ARR];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figure.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figure.getDefaultFigure();
                figures[i].draw();
            }
        }

    }
}
