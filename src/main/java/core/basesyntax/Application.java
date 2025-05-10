package core.basesyntax;

public class Application {
    private static final int FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[FIGURE_AMOUNT];

        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = figureSupplier.getRandomFigure();
                System.out.println(figure[i].drawFigure());
            } else {
                figure[i] = figureSupplier.getDefaultFigure();
                System.out.println(figure[i].drawFigure());
            }
        }
    }
}
