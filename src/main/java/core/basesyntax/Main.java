package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                supplier.getRandomFigure().draw();
                System.out.println();
            } else {
                supplier.getDefaultFigure().draw();
                System.out.println();
            }
        }
    }
}
