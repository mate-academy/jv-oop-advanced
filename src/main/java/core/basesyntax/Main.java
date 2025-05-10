package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[]args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
                figure[i].draw();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
                figure[i].draw();
            }
        }
    }
}
