package core.basesyntax;

public class Main {
    public static final int FIGURE_COUNT = 6;
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                randomFigure.setColor(colorSupplier.getRandomColor());
                figures[i] = randomFigure;
            } else {
                figures[i] = FigureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
