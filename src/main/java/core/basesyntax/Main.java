package core.basesyntax;

public class Main {
    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i <= ARRAY_LENGTH / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
