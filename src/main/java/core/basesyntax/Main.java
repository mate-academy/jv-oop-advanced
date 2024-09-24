package core.basesyntax;

public class Main {
    private static final int FIGURES_QUANTITY = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure [] figures = {supplier.getRandomFigure(), supplier.getRandomFigure(),
                supplier.getRandomFigure(), supplier.getDefaultFigure(),
                supplier.getDefaultFigure(), supplier.getDefaultFigure()};
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
