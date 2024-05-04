package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6]; // Array size can be 3 or 6

        // Generating the first half of figures with random parameters
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Generating the second half of figures with default parameters
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Displaying all figures
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

