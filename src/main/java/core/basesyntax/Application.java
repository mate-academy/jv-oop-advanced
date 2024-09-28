package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure(); // generation random figures for array
        }

        // generation default figure for array
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
