package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
        }

        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
            figure[i].draw();
        }
    }
}


