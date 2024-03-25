package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        // Create the array with 6 elements (3 random figures, 3 default figures)
        for (int i = 0; i < 6; i++) {
            // Check the index to determine if it's for a random figure or a default figure
            Figure figure;
            if (i < 3) {
                // Create a random figure
                figure = figureSupplier.getRandomFigure();
            } else {
                // Create a default figure
                figure = figureSupplier.getDefaultFigure();
            }
            // Print the figure information
            System.out.println(figure);
        }
    }
}

