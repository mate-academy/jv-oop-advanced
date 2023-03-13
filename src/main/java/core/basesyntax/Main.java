package core.basesyntax;

public class Main {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            figures[i] = randomFigure;
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            Figure randomFigure = figureSupplier.getDefaultFigure();
            figures[i] = randomFigure;
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
