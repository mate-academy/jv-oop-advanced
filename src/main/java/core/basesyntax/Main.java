package core.basesyntax;

public class Main {
    private static final Figure[] figures = new Figure[6];

    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].obtainTheArea();
            figures[i].draw();
        }
    }
}
