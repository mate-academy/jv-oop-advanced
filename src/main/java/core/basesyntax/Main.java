package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Shape[] array = figureSupplier.createArray();

        for (Shape shape : array) {
            System.out.println(shape.draw() + "\n");
        }
    }
}
