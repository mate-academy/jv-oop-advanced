package core.basesyntax;

public class Main extends FigureSupplier {
    public static void main(String[] args) {
        int limit = 6;
        Figure defaultFigure = getDefaultFigure();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[limit];
        for (int i = 0; i < limit; i++) {
            if (i < limit / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
