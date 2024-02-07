package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] array = new Figure[5];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = figureSupplier.getRandomFigure();
            array[i].draw();
        }
        for (int j = array.length / 2; j < array.length; j++) {
            figureSupplier.getDefaultFigure().draw();
        }
        System.out.println();
    }
}
