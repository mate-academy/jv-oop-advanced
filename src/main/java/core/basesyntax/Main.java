package core.basesyntax;

public class Main {
    public static void main(java.lang.String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int y = figures.length / 2; y < figures.length; y++) {
            figures[y] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
