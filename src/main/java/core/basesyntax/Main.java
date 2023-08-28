package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
            figure[i].draw();
        }
    }
}
