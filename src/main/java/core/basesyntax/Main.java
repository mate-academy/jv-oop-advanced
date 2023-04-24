package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arrLen = 6;

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arrLen];
        for (int i = 0; i < arrLen; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= 3) {
                figures[i] = figureSupplier.defaultFigure();
            }
            figures[i].draw();
        }
    }
}
