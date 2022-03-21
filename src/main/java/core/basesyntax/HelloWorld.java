package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main (String[] args){
        Figure[] figures = new Figure[6];
        FigureSupplier fig = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            figures[i] = fig.getRandomFigure();
            figures[i].getDetails();
        }
    }
}
