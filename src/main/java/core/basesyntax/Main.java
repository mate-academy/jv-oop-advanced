package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
            FigureSupplier.getRandomFigure(),
            FigureSupplier.getRandomFigure(),
            FigureSupplier.getRandomFigure(),
            FigureSupplier.getDefaultFigure(),
            FigureSupplier.getDefaultFigure(),
            FigureSupplier.getDefaultFigure()
        };

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
