package core.basesyntax;

public class Main {
    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figure = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_LENGTH / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
        }
        for (int i = ARRAY_LENGTH / 2; i < ARRAY_LENGTH; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            figure[i].draw();
        }
    }
}
