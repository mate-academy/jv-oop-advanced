package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        int halfSize = figures.length / 2;
        for (int i = 0; i < halfSize; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[halfSize + i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
