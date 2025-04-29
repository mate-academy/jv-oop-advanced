package core.basesyntax;

public class Application {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figure[] figures = new Figure[6];

    public static void main(String[] args) {
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
