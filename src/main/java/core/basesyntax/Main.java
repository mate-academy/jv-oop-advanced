package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arr = new Figure[6];
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println(colorSupplier.getRandomColor());
    }
}
