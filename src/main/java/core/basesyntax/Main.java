package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figure[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
