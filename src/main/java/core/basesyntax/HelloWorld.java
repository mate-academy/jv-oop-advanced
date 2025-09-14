package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        figures[0] = supplier.getRandomfigure();
        figures[1] = supplier.getRandomfigure();
        figures[2] = supplier.getRandomfigure();
        figures[3] = supplier.getDefaultfigure();
        figures[4] = supplier.getDefaultfigure();
        figures[5] = supplier.getDefaultfigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
