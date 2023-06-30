package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 4;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i == 0) {
                figures[0] = new IsoscelesTrapezoid().getRandomFigure();
                figures[0].draw();
            } else if (i == 1) {
                figures[1] = new RightTriangle().getRandomFigure();
                figures[1].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
