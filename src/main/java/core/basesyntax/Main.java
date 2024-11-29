package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        ShapeSupplier generatedShape = new ShapeSupplier();

        for (int i = 0; i < shapes.length / 2; i++) {
            shapes[i] = generatedShape.getRandomShape();
            shapes[i].draw();
        }
        for (int i = shapes.length / 2; i < shapes.length; i++) {
            shapes[i] = generatedShape.getDefaultShape();
            shapes[i].draw();
        }
    }
}
