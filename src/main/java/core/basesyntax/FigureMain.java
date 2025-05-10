package core.basesyntax;

public class FigureMain {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = FigureSupplier.getRandomFigure();

        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = FigureSupplier.getDefaultFigure();
        }
        for (Figure fig : figure) {
            fig.getArea();
            fig.draw();
        }
    }

}
