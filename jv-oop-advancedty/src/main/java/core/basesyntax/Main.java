package core.basesyntax;

public class Main {

    public static final int COUNT = 4;

    public static void main(String[] args) {
        Figure[] figures = new Figure[COUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) { // констант
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
