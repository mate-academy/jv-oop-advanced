package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            figures[i] = (i < 5) ? figureSupplier.getRandomFigure()
                                 : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
