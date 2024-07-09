package core.basesyntax;

import static core.basesyntax.Figure.ARRAYS_LENGTH;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[ARRAYS_LENGTH];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = supplier.getRandomFigure();
                figure[i].draw();
            }
            if (i >= figure.length / 2) {
                figure[i] = supplier.getDefaultFigure();
                figure[i].draw();
            }
        }
    }
}
