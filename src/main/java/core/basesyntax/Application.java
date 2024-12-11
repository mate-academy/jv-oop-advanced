package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        int halfSize = figures.length / 2;
        for (int i = 0; i < halfSize; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
            figures[halfSize + i] = FigureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
