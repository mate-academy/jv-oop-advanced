package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        figureSupplier.getDefaultFigure().draw();

        for (int i = 0; i < 6; i++) {
            figureSupplier.getRandomFigure().draw();
        }
    }
}
