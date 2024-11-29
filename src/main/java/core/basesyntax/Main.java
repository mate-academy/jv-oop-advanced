package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        for (int i = 0; i < shapes.length / 2; i++) {
            shapes[i] = new ShapeSupplier().getRandomShape();
            shapes[i].draw();
        }
        for (int i = shapes.length / 2; i < shapes.length; i++) {
            shapes[i] = new ShapeSupplier().getDefaultShape();
            shapes[i].draw();
        }
    }
}
