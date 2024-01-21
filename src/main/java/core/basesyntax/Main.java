package core.basesyntax;

public class Main {
    public static final int ARRAY_LENGTH = 6;
    public static final int FIRST_HALF_ARRAY = ARRAY_LENGTH / 2;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < FIRST_HALF_ARRAY) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.drawable();
        }
    }
}
