package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure[] figures = new Figure[5];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figure.getRandomFigure(colorSupplier.getRandomColor());
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figure.getDefaultFigure(colorSupplier.getRandomColor());
        }

        for (Figure fig : figures) {
            fig.draw();
        }
    }
}
