package core.basesyntax;

public class Main {
    public static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure(colorSupplier.getRandomColor());
            }
            if (i >= 3 && i < NUMBER_OF_FIGURES) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}

