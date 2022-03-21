package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = {fs.getDefaultFigure(), fs.getDefaultFigure(), fs.getDefaultFigure(),
                fs.getRandomFigure(), fs.getRandomFigure(), fs.getRandomFigure()};
        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
