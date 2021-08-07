package core.basesyntax;

public class MainApp {
    public static final int FIGURE_COUNT = 5;
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
