package core.basesyntax;

public class Main {
    private static final int FIGURE_NUMBERS = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_NUMBERS];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < FIGURE_NUMBERS; i++) {
            if (i < FIGURE_NUMBERS / 2) {
                figures[i] = figure.getRandomFigure();
                System.out.println(figures[i].draw());
            } else {
                figures[i] = figure.getDefaultFigure();
                System.out.println(figures[i].draw());
            }
        }
    }
}
