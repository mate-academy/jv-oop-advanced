package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figure = new Figure[6];
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
