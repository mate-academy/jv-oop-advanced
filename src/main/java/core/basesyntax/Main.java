package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figuresCount = 8;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[figuresCount];
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRundomFigure();
            System.out.println(figure[i].getFigureInfo());
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
            System.out.println(figure[i].getFigureInfo());
        }
    }
}
