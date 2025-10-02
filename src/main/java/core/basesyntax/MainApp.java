package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        final int arraySize = 6;

        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
