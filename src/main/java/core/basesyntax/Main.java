package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[11];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < (figures.length / 2)
                    ? figureSupplier.getRandomFigure() : FigureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
