package core.basesyntax;

public class Main {
    public static final int MAX_VALUE = 6;
    public static final int HALF_OF_MAX = MAX_VALUE / 2;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_VALUE];
        for (int i = 0; i < MAX_VALUE; i++) {
            if (i < HALF_OF_MAX) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            } else {
                figures[i] = figureSupplier.getDefoltCircle();
            }
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
