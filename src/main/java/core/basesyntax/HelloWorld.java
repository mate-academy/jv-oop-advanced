package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        figures[0] = supplier.getRandomFigure();
        figures[1] = supplier.getRandomFigure();
        figures[2] = supplier.getRandomFigure();
        figures[3] = supplier.getDefaultFigure();
        figures[4] = supplier.getDefaultFigure();
        figures[5] = supplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
