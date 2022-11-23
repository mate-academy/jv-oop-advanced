package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[]{
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getDefaultFigure()
        };
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
