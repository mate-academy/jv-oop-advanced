package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int arraySize = 6;
        Figure[] figureArray = new Figure[arraySize];
        /*for (int i = 0; i < figureArray.length; i++) {

        }*/
        Circle circle = new Circle("blue", 5);
        circle.name = "circle";
        circle.printInformation();

        ColorSupplier tmp = new ColorSupplier();
        System.out.println(tmp.getRandomColor());
    }
}
