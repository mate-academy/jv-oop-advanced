package core.basesyntax;

public class Main {
    private static final FigureSupplier supplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = {
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getDefaultFigure(),
                supplier.getDefaultFigure(),
                supplier.getDefaultFigure()
        };

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
