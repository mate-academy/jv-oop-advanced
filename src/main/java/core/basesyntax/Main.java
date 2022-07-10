package core.basesyntax;

public class Main extends FigureSupplier {
    public static final int ARRAY_LIMIT = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figures defaultFigure = getDefaultFigure();

    public static void main(String[] args) {

        Figures[] figure = new Figures[ARRAY_LIMIT];
        for (int i = 0; i < figure.length; i++) {
            if (i < ARRAY_LIMIT / 2) {
                figure[i] = figureSupplier.getRandomFigure();
            } else {
                figure[i] = getDefaultFigure();
            }
            figure[i].draw();
        }
    }
}
