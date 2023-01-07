package core.basesyntax;

public class FigureProgram {
    public static final int SIZE_OF_FIGURES_ARRAY = 10;

    public static void main(String[] args) {
        Figure [] figures = new Figure[SIZE_OF_FIGURES_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        int middleOfArray = SIZE_OF_FIGURES_ARRAY / 2;
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < middleOfArray
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
