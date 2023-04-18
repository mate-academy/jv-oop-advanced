package core.basesyntax;

public class Main {
    private static final FigureSupplire figureSupplire = new FigureSupplire();

    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplire.getRandomFigure();
            } else {
                figure[i] = figureSupplire.getDefaultFigure();
            }
            figure[i].getDraw();
        }
    }
}
