package core.basesyntax;

public class Main {
    private static final int figureNumber = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[figureNumber];
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure defaultFigure = figureSupplier.getDefaultFigure();

        for (int i = 0; i < figureNumber / 2; i++) {
            figures[i] = defaultFigure;
        }
        for (int i = figureNumber / 2; i < figureNumber; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
