package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = figure.getRandomFigure();
            } else {
                figures[i] = figure.getDefaultFigure();
            }
            System.out.println(figures[i].getInfo());
        }
    }
}
