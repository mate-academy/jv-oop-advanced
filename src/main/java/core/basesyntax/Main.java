package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int figures = 5;
        for (int i = 0; i < figures / 2; i++) {
            figureSupplier.getRandomFigure().draw();
        }
        figureSupplier.getDefaultFigure().draw();

    }
}
