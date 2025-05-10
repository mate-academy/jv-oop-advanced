package core.basesyntax;

public class Main {
    private static final int DIVISOR = 2;

    public static void main(String[] args) {

        AbstractFigure [] figures = new AbstractFigure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i % DIVISOR == 0) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}

