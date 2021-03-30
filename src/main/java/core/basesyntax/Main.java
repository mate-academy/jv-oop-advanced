package core.basesyntax;

public class Main {
    private static final int FIGURE_NUMBER = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) Math.random() * FIGURE_NUMBER + 1];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().generateFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].drawFigure();
        }
    }
}
