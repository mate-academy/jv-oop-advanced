package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            figureSupplier.getRandomFigure().toDraw();
        }
        for (int i = 0; i < 10; i++) {
            figureSupplier.getDefaultFigure().toDraw();
        }
    }
}
