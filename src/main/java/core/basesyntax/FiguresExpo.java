package core.basesyntax;

public class FiguresExpo {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(9);
        Figure[] figures = figureSupplier.getFigures();

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
