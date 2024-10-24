package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        // Generate first half with random figures
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Generate second half with default figures
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Draw all figures
        for (Figure figure : figures) {
            figure.draw();
            System.out.println("Area: " + figure.calculatedArea());
            System.out.println();
        }
    }
}
