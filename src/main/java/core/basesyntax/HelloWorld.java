package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figura = new FigureSupplier();
        /* I create a new figure supplier object because the method
         is not static and I can't call it directly */
        for (int i = 0; i < 3; i++) {
            figures[i] = figura.getRandomFigure();
        }
        for (int j = 3; j < 6; j++) {
            figures[j] = figura.getDefaultFigure();
        }
        for (int k = 0; k < 6; k++) {
            figures[k].toDraw();
        }
    }
}
