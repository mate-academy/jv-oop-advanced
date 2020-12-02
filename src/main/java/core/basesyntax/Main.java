package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Shape[] shapeArr = new FigureProducer().fill();

        for (Shape element : shapeArr) {
            System.out.println(element.displayInfo());
        }
    }
}
