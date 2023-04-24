package core.basesyntax;

public class Main {
    static final int arrayLength = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i >= 3) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
