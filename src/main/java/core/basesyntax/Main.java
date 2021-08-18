package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] rez = figureSupplier.getRandomFigure().getArray();
        for (int i = 0; i < rez.length; i++) {
            rez[i].draw();
        }
    }
}
