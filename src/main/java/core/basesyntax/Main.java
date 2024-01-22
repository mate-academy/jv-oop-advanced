package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 6; i++) {
            Figure figure = (i < 3)
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figure.draw();
        }
    }
}
