package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[9];
        for (int i = 0; i < figures.length; i++) {
            if (i < FIGURE_COUNT) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.buildFigure();
        }
        double g = 9;
        int h = 3;
        System.out.println(g * h);
    }
}
