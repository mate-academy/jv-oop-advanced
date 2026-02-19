package core.basesyntax;
public class Main {
    private static final int COUNT_FIGUR = 6;
    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT_FIGUR];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (int i = 0; i < figures.length; i++) {
            ((Drawable) figures[i]).draw();
        }
    }
}
