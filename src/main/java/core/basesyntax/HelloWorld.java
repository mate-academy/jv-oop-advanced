package core.basesyntax;

public class HelloWorld {
    private static final int FIGURES_COUNT = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
