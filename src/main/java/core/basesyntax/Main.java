package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            Figure figure;
            if (i < 6 / 2) {
                figure = figureSupplier.getRandomFigure();
            } else {
                figure = figureSupplier.getDefaultFigure();
            }
            figure.draw();
        }
    }
}
