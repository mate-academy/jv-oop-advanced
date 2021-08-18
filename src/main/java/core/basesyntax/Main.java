package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier supplier = new FigureSupplier();
        Figure circle = supplier.getRandomFigure();


        System.out.println();
    }

}
