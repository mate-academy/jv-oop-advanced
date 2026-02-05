package core.basesyntax;

public class Main {
    public static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[FIGURES_COUNT];

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = i < FIGURES_COUNT / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figuresArray) {
            figure.draw();
        }
    }
}
