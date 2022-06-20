package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 8;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figure = new FigureSupplier();
        for (int i = 0; i < (figures.length / 2); i++) {
            figures[i] = figure.getRandomFigure();
        }

        for (int i = (figures.length / 2); i < figures.length; i++) {
            figures[i] = figure.getDefaultFigure();
        }

        for (Figure value : figures) {
            value.draw();
        }
    }
}
