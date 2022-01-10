package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Figure[] arr = new Figure[6];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = supplier.getRandomFigure();
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = supplier.getDefaultFigure();
        }

        for (Figure all : arr) {
            System.out.println(all.toDraw());
        }
    }
}
