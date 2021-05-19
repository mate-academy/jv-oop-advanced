package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        int size = (int)(Math.random() * 5 + 1);
        Figure[] array = new Figure[size];
        for (int i = 0;i < size;i++) {
            array[i] = supplier.getRandomFigure();
            array[i].draw();
        }
    }
}
