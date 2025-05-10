package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        Figure[] figures = figureSupplier.generateFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
