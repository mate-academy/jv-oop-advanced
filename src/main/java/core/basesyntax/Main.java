package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 6;

        Figures[] figuresArray = new Figures[ARRAY_SIZE];
        FigureSupplier figure = new FigureSupplier();

        for  (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < ARRAY_SIZE / 2) {
                figuresArray[i] = figure.GetRandomFigure();
            } else {
                figuresArray[i] = figure.defaultFigure();
            }
            figuresArray[i].drawFigure();
        }
    }
}
