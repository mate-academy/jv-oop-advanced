package core.basesyntax;

public class HelloWorld {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getDefaultFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].drawFigure();
        }
    }
}
