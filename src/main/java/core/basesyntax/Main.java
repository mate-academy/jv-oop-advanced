package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();

        Shape[] array = fs.createArray();

        for (Shape shape : array) {
            System.out.println(shape.draw() + "\n");
        }

    }
}
