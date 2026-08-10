package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier fs = new FigureSupplier();
        for (int i = 0; (i < figures.length / 2); i++) {
            figures[i] = fs.getRandomFigure();
        }
        for (int i = (figures.length - 1); (i >= figures.length / 2); i--) {
            figures[i] = fs.getDefaultFigure();
        }
        /*for ( int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = fs.getDefaultFigure();
        // за один прохід
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < (figures.length / 2) ? fs.getRandomFigure() : fs.getDefaultFigure();
        }
        }*/
        for (Figure figure : figures) {
            figure.calculateArea();
            figure.draw();
        }
    }
}
