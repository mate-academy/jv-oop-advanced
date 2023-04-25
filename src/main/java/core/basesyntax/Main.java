package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = (Figure) figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
