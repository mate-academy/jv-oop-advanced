package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 6; i += 2) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
            figure[i + 1] = figureSupplier.getDefaultFigure();
            figure[i + 1].draw();
        }
    }
}
