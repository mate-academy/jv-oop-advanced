package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int size = 9;
        Figure[] figures = new Figure[size];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < size; i++) {
            figures[i] = i < size / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
