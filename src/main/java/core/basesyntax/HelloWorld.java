package core.basesyntax;

public class HelloWorld {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure [] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            if (i <= NUMBER_OF_FIGURES / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}


