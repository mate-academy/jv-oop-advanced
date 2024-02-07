package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure1 : figure) {
            figure1.draw();
        }
    }
}
