package core.basesyntax;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(10)];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = ShapeProducer.getShape();
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
