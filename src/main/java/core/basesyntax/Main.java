package core.basesyntax;

public class Main {
    public static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figure = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
            figure[i].draw();
        }
    }
}
