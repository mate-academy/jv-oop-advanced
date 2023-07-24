package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figureCount = 6;

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figureCount; i++) {
            Figure figure = (i < figureCount / 2) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figure.draw();
        }
    }
}
