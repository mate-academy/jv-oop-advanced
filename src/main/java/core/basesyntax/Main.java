package core.basesyntax;

public class Main {
    private static final int NUMBER_OF_FIGURES = 7;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArr = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figuresArr.length; i++) {
            figuresArr[i] = (i < 5) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figuresArr) {
            figure.draw();
        }
    }
}
