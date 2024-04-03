package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

        Drawable[] figures = new Drawable[6]; // Array of 6 drawable figures

        // Generate the first half of figures with random properties
        for (int i = 0; i < 3; i++) {
            figures[i] = (Drawable) figureSupplier.getRandomFigure();
        }

        // Generate the second half of figures with default properties
        for (int i = 3; i < 6; i++) {
            figures[i] = (Drawable) figureSupplier.getDefaultFigure();
        }

        // Display all figures
        for (Drawable figure : figures) {
            figure.draw();
        }
    }
}

