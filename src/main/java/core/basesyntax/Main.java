package core.basesyntax;

public class Main {
    private static final int AMOUNT_FIGURE = 6;

    public static void main(String[] args) {
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < AMOUNT_FIGURE; i++) {
            if (i < AMOUNT_FIGURE / 2) {
                Figure randomFigure = (Figure) new FigureSupplier().getRandomFigure();
                randomFigure.draw();
            } else {
                defaultFigure.draw();
            }
        }
    }
}
