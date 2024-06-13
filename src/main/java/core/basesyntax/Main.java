package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int max = 6;
        Figure[] figure = new Figure[max];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < max / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].setColor(colorSupplier.getRandomColor());
        }
        for (int i = max / 2; i < max; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < max; i++) {
            figure[i].drawFigure();
        }
    }
}
