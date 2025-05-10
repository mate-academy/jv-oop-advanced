package core.basesyntax;

public class HelloWorld {
    public static final int FIGURE_QUANTITY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_QUANTITY];
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
