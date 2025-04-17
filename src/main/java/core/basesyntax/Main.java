package core.basesyntax;

public class Main {
    public static void main(String[] Args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[5];

        // First half of the array with random figures
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(colorSupplier);
        }

        // Second half of the array with default figures
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure(colorSupplier);
        }

        // Print out the figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}