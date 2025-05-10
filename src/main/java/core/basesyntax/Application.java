package core.basesyntax;

public class Application {
    private static final int MAXIMUM_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAXIMUM_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();

        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < figures.length; i++) {
            figures[i] = defaultFigure;
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
