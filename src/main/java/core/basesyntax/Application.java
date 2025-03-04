package core.basesyntax;

public class Application {
    public static final int ARRAY_LENGTH = 7;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        int halfOfFigures = ARRAY_LENGTH / 2;
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < halfOfFigures; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = halfOfFigures; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
