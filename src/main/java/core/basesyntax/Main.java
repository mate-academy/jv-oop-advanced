package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
