package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].setColor(colorSupplier.getRandomColor());
        }
        for (int i = 3; i < 6; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < 6; i++) {
            figure[i].drawFigure();
        }
    }
}
