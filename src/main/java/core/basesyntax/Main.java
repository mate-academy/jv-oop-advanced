package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier array = new FigureSupplier();
        Figure[] pipa = array.figureGen();
        for (int i = 0; i < pipa.length; i++) {
            pipa[i].drawFigure();
        }
    }

}
