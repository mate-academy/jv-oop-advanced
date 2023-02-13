package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        defaultFigure.draw();
        Figure[] figure = new Figure[5];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
        }
    }
}
