package core.basesyntax;

public class Main {
    static final int ARRAY_SIZE = 10;
    static final double RANDOM_FIG_PART = 0.5;

    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure[] figArray = new Figure[ARRAY_SIZE];
        for (int i = 0; (double) i < (double) figArray.length * RANDOM_FIG_PART; i++) {
            figArray[i] = figure.getRandomFigure();
        }
        for (int j = (int) (figArray.length * RANDOM_FIG_PART); j < figArray.length; j++) {
            figArray[j] = figure.getDefaultFigure();
        }
        for (Figure element : figArray) {
            element.draw();
        }
    }
}
