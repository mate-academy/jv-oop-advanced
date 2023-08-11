package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier rndFigure = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = rndFigure.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = rndFigure.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
