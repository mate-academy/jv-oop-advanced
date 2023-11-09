package core.basesyntax;

public class Main {
    public static final int FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[FIGURE_AMOUNT];
        for (int i = 0; i < FIGURE_AMOUNT; i++) {
            if (i < FIGURE_AMOUNT / 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figuresArray) {
            figure.draw();
        }
    }
}
