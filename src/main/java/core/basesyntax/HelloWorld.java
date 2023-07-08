package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[3];

        for (int i = 0; i < figures.length - 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int j = figures.length - 1; j < figures.length; j++) {
            figures[j] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
