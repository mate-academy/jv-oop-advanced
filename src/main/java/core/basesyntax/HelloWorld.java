package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = {new FigureSupplier().getRandomFigure(), new FigureSupplier().getDefaultFigure()
                , new FigureSupplier().getRandomFigure(), new FigureSupplier().getDefaultFigure()
                , new FigureSupplier().getRandomFigure(), new FigureSupplier().getRandomFigure()};
        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
