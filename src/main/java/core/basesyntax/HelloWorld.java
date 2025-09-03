package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Drawable[] figures = new Drawable[6];

        for (int i = 0; i < figures.length / 2; i++) {
            Drawable figure = supplier.getRandomFigure();
            figures[i] = figure;
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            Drawable figure = supplier.getDefaultFigure();
            figures[i] = figure;
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}
