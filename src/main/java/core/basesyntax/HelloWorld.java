package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure [] array = {figure.getRandomFigure(),figure.getDefaultFigure(),
                figure.getDefaultFigure(),figure.getRandomFigure()};
        for (int i = 0; i < array.length; i++) {
            array[i].getArea();
        }
    }

}
