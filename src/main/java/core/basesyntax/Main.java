package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Draw[] draws = new Draw[6];
        for (int i = 0; i < draws.length / 2; i++) {
            draws[i] = figureSupplier.getRandomFigure();
        }
        for (int i = draws.length / 2; i < draws.length; i++) {
            draws[i] = figureSupplier.getDefaultFigure();
        }
        for (Draw figure : draws) {
            figure.draw();
        }
    }
}
