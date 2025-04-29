package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < 3; i++) {
            Figure defaultFigure = figureSupplier.getDefaultFigure();
        }
    }
}

