package core.basesyntax;

public class Main {
    public static final int FIGURE_NUMBER = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURE_NUMBER; i++) {
            if (i < FIGURE_NUMBER / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
