package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Figure [] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure randomFigure: figure) {
            randomFigure.draw();
        }
    }
}
