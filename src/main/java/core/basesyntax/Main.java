package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figures.length / 2; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            randomFigure.setColor(colorSupplier.getRandomColor());
            figures[i] = randomFigure;
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
