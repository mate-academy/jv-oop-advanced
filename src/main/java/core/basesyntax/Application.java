package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < 3) {
                figure[i] = figureSupplier.getRandomFigure();
                figure[i].getDraw();
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
                figure[i].getDraw();
            }
        }
    }
}
