package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[60];
        for (int i = 0; i < 30; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 30; i < 60; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.display();
        }
    }
}

