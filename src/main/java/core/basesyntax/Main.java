package core.basesyntax;

public class Main {
    public static void main(String[] Args) {
        ColorSupplier color = new ColorSupplier();
        FigureSupplier figure = new FigureSupplier();

        Figure[] figures = new Figure[5];

        // First half of the array with random figures
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figure.getRandomFigure(ColorSupplier.getRandomColor());
        }

        // Second half of the array with default figures
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figure.getDefaultFigure(ColorSupplier.getRandomColor());        }

        // Print out the figures
        for (Figure fig : figures) {
            fig.draw();
        }
    }
}