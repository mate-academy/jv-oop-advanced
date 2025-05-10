package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier array = new FigureSupplier();
        Figure[] figureArray = array.figureGen();
        for (Figure figure : figureArray) {
            figure.drawFigure();
        }
    }
}
