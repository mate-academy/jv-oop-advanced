package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Figure[] array = new Figure[n];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figureSupplier.getRandomFigure();
                System.out.println(array[i].draw());
            } else {
                array[i] = figureSupplier.getDefaultFigure();
                System.out.println(array[i].draw());
            }
        }
    }
}
