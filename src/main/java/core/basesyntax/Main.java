package core.basesyntax;

public class Main {
    private final int massiveSize = 6;

    public static void main(String[] args) {
        Main figureArraySize = new Main();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[figureArraySize.massiveSize];

        for (int i = 0; i < figureArraySize.massiveSize; i++) {
            if (i < figureArraySize.massiveSize / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
