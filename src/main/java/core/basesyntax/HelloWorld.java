package core.basesyntax;

public class HelloWorld {
    public static final int NUMBERS_OF_FIGURES = 6;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        FigureArea[] figures = new FigureArea[6];

        for (int i = 0; i < NUMBERS_OF_FIGURES; i++) {
            if (i < NUMBERS_OF_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            ((Drawable) figures[i]).draw();
        }
    }
}
