package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
        }

        for (int i = 0; i < figure.length - 3; i++) {
            figure[i + 3] = figureSupplier.getDefaultFigure();
            figure[i + 3].draw();
        }
    }
}
