package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[5];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
        }
        for (int i = 2; i < 5; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
            figure[i].draw();
        }
    }
}
