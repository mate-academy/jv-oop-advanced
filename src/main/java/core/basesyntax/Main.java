package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
            new FigureSupplier().getRandomFigure(),
            new FigureSupplier().getRandomFigure(),
            new FigureSupplier().getRandomFigure(),
            new FigureSupplier().getDefaultFigure(),
            new FigureSupplier().getDefaultFigure(),
            new FigureSupplier().getDefaultFigure()
        };

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
