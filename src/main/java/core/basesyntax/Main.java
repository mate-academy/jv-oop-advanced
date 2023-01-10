package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Square();
        ColorSupplier supplier = new ColorSupplier();
        System.out.println(figure.getArea());
        System.out.println(supplier.getRandomColor());
    }
}
