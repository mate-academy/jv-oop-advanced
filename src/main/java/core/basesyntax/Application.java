package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figures[i] = fs.getRandomFigure();
            figures[i + 3] = fs.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
