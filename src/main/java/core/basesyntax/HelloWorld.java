package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main (String[] args){
        Figure[] figures = new Figure[6];
        FigureSupplier def = new FigureSupplier();
        figures[0] = def.getDefaultFigure();
        figures[0].getDetails();
    }
}
