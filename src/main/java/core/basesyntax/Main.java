package core.basesyntax;

public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < SIZE; i++) {
            figures[i] = (i < (SIZE / 2)) ? figure.getRandomFigure() : figure.getDefaultFigure();
            figures[i].draw();
        }
    }
}
