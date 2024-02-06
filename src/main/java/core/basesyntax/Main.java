package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        figures = figureSupplier.fillArray(figures);

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
